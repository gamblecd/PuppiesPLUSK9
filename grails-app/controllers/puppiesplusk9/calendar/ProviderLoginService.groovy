package puppiesplusk9.calendar

import grails.validation.Validateable

import org.scribe.model.Verifier

import uk.co.desirableobjects.oauth.scribe.OauthService
@Validateable
class ProviderLoginService {
	String provider;
	def controller;
	def session;
	OauthService oauthService;
	
	ProviderLoginService(service, controller) {
		this(service, 'google', controller);
	}
	ProviderLoginService(service, String provider, controller) {
		oauthService = service;
		this.provider = provider;
		this.controller = controller;
		this.session = controller.session;
	}
	
	def getProviderAccessToken() {
		String sessionKey = oauthService.findSessionKeyForAccessToken('google')
		def token = session[sessionKey];
		return token;
	}

	def authorizeToProvider() {
		def requestToken = oauthService.getRequestToken(provider);
		String sessionKey = oauthService.findSessionKeyForRequestToken(provider);
		session[sessionKey] = requestToken;
		String authorizationUrl = oauthService.getAuthorizationUrl(provider, requestToken);
		return authorizationUrl;
	}
	
	def boolean authorizeFromProvider() {
		def sessionKey = oauthService.findSessionKeyForRequestToken(provider);
		def requestToken = session[sessionKey];
		String oauthVerifier = controller.request.getParameter("oauth_verifier");
		def accessToken = oauthService.getAccessToken(provider, requestToken,
										new Verifier(oauthVerifier == null?"123456":oauthVerifier));
		sessionKey = oauthService.findSessionKeyForAccessToken(provider);
		session[sessionKey] = accessToken;
	}
}
