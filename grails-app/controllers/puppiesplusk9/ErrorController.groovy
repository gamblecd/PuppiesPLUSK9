package puppiesplusk9

import puppiesplusk9.exception.ServerException

class ErrorController {

    def index() { }
    
    def error(int errCode, String errMessage) {
		render(controller:"error", view: "error.gsp", 
			model:[code:errCode, message:errMessage]);
    }
	def errorWithLayout(int errCode, String errMessage) {
		render(controller:"error", view: "errorLayouted.gsp",
			model:[code:errCode, message:errMessage]);
	}
	
	def serveError(ServerException err) {
		errorWithLayout(err.errorCode, err.serverMessage);
	}
	
    def pageNotFound() {
		serveError(ServerException.NOT_FOUND);
		
    }
    
    def serverError() {
		serveError(ServerException.SERVER_ERROR);
    }
    
}
