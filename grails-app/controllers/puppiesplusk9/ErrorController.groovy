package puppiesplusk9

import org.springframework.aop.aspectj.RuntimeTestWalker.ThisInstanceOfResidueTestVisitor;

class ErrorController {

    def index() { }
    
    def error(int code, String message) {
        return [code:code, controller: "error", view: "error.gsp", message:message ];
    }

    def pageNotFound() {
        def code = 404;
        def message = "Page Not Found.";
        render(code:code, controller: "error", view: "error.gsp", message:message);
    }
    
    def serverError() {
        def code = 500;
        def message = "An internal server error has occurred. We are sorry for the inconvenience.";
        return [code:code, controller: "error", view: "error.gsp", message:message ];
    }
    
}
