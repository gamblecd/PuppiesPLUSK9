package puppiesplusk9

class HomeController {
    
    def demo() {
        render(view: "demo.gsp")
    }

    def index() { return "Hello World!" }
    
    def testimonials() {return "Testimonials" }
    
    def about() {return "main" }
}
