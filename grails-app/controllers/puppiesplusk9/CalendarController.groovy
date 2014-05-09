package puppiesplusk9

import grails.converters.JSON
import puppiesplusk9.calendar.ProviderLoginService
import puppiesplusk9.exception.ServerException
import uk.co.desirableobjects.oauth.scribe.OauthService

class CalendarController {
	
	def OauthService oauthService;	
	
	def show() {
		try {
			def ProviderLoginService google = new ProviderLoginService(oauthService, 'google', this);
			def sessionToken = loginWithProvider(google);
			if (sessionToken == null) {
				return;
			}
		
			String gCalListResource = 'https://www.googleapis.com/calendar/v3/calendars/primary/events?key='+grailsApplication.config.oauth.providers.google.key;
			String gCalResource = 'https://www.googleapis.com/calendar/v3/users/me/calendar?key='+grailsApplication.config.oauth.providers.google.key;
			def calendars = oauthService.getGoogleResource(sessionToken, gCalListResource);
			def calendarsJSON = JSON.parse(calendars.body)
			render(view:"calendar.gsp", model:[events:calendarsJSON['items']]);
		} catch (ServerException se) {
			ErrorController.error(se);
		}
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

}
