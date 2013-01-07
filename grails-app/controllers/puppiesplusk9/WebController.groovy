package puppiesplusk9

class WebController {
    
    def demo() {
        render(view: "demo.gsp")
    }
	
	def index() {render(view: "home.gsp")}
	
	def about() {render(view: "about.gsp")}
	
	def whatIDo() {render(view: "description.gsp")}
	
    def testimonials() {render(view: "testimonials.gsp")}
    
    def events() {render(view: "events.gsp")}
	
	def contact() {render(view: "contact.gsp")}
	
}
