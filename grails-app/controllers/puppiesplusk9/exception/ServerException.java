package puppiesplusk9.exception;

import grails.validation.Validateable;


@Validateable
public class ServerException extends Throwable {
	
	public static final ServerException NOT_FOUND = new ServerException(404, "Page Not Found.");
	public static final ServerException SERVER_ERROR = new ServerException(500, "An internal server error has occurred. We are sorry for the inconvenience.");
	public static final ServerException AUTHORIZATION_DENIED = new ServerException(403, "You do not have authorization to perform that action.");

	public int errorCode;
	public String serverMessage;
	
	private static final long serialVersionUID = -5105208457854892701L;
	
	ServerException() {
		this(500, "Something went wrong");
	}
	
	ServerException(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.serverMessage = message;
	}
	
	ServerException(ServerException x) {
		this(x.errorCode, x.serverMessage);
	}
}
