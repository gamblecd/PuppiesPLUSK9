package puppiesplusk9

class ErrorController {

    def index() { }
    
    def error() {
        render(view: "error.gsp")
    }
    
    def notFound() {
        code:404
        message: "Page requested could not be found."
        render(view: "error.gsp")
    }
    
}
