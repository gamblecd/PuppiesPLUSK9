package puppiesplusk9

import grails.converters.JSON
import puppiesplusk9.calendar.ProviderLoginService
import puppiesplusk9.exception.ServerException
import uk.co.desirableobjects.oauth.scribe.OauthService

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.googleapis.json.GoogleJsonResponseException
import com.google.api.client.http.HttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson.JacksonFactory
import com.google.api.services.calendar.Calendar
import com.google.api.services.calendar.CalendarScopes
import com.google.api.services.calendar.model.Event

class CalendarController {
	
	def OauthService oauthService;	
	
	def show() {
		def ProviderLoginService google = new ProviderLoginService(oauthService, 'google', this);
		def sessionToken;
		try {
			sessionToken = loginWithProvider(google);
			if (sessionToken == null) {
				return;
			}
		} catch (ServerException se) {
			forward(controller:'error', action:'serveError', error:se);
		}
		String gCalListResource = 'https://www.googleapis.com/calendar/v3/calendars/primary/events?key=AIzaSyCh5I89G8ZMc51-3i-y7H-HGciRGEHDZCE';
		String gCalResource = 'https://www.googleapis.com/calendar/v3/users/me/calendar?key='+grailsApplication.config.oauth.providers.google.key;
		def calendars = oauthService.getGoogleResource(sessionToken, gCalListResource);
		def calendarsJSON = JSON.parse(calendars.body)
		for (def event: calendarsJSON['items']) {
            event['start']['dateTime'] = parseDate(event['start']['dateTime']);
        }
        
		render(view:"calendar.gsp", model:[events:calendarsJSON['items']]);
	}
    
    private Date parseDate(date) {
        return Date.parse("yyyy-MM-dd'T'HH:mm:ssX",date.toString());
    }

    def loginWithProvider(ProviderLoginService provider) {
        def sessionToken = provider.getProviderAccessToken();
        if (sessionToken == null) {
            try {
                provider.authorizeFromProvider();
            } catch (Exception authFailedException) {
                String authorizationUrl = provider.authorizeToProvider();
                redirect(url:authorizationUrl);
            }
            sessionToken = provider.getProviderAccessToken();
            
        }
        return sessionToken;
    }
    
    def showFromService() {
        HttpTransport transport = new NetHttpTransport();
        JacksonFactory factory = new JacksonFactory();
        AuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(transport, factory, "284612093388-l2al72f5ogav167a7e84e6m0i6lun5ga.apps.googleusercontent.com", "VIH05WmmAT0yZgjbTVNBHw8m", [
                    CalendarScopes.CALENDAR,
                    CalendarScopes.CALENDAR_READONLY
                ]).setApprovalPrompt("force").build();
        GoogleCredential credential = new GoogleCredential.Builder().setTransport(transport)
                .setJsonFactory(factory)
                .setServiceAccountId('284612093388-ksc8qd1egj2i3e1t3hong5gaoe6tcpkb@developer.gserviceaccount.com')
                .setServiceAccountScopes([
                    CalendarScopes.CALENDAR,
                    CalendarScopes.CALENDAR_READONLY
                ])
                .setServiceAccountPrivateKeyFromP12File(new File("service.p12"))
                .setServiceAccountUser("marchele@puppiesplusk9.com")
                .build();
        Calendar service = new Calendar.Builder(transport, factory, credential)
                .setApplicationName("puppiesplusk9.com/1.0")
                .setHttpRequestInitializer(credential).build();
        String pageToken = null;
        try {
           
        while (true) {
            def events = service.events().list('primary').execute();
            List<Event> items = events.getItems();
            for (Event event : items) {
                System.out.println(event.getSummary());
            }
            pageToken = events.getNextPageToken();
            if (pageToken == null) break;
        }
       } catch (GoogleJsonResponseException e) {
        System.err.println(e.getDetails());
      }
        
        render("");
    }
    
    
	
}
