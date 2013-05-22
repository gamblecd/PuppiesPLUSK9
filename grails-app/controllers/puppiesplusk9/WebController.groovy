package puppiesplusk9

import puppiesplusk9.email.EmailController

class WebController {
    ErrorController error = new ErrorController();
   
    def demo() {
        render(view: "demo.gsp")
    }
	
	def index() {render(view: "home.gsp")}
	
	def about() {render(view: "about.gsp")}
	
	def whatIDo() {render(view: "description.gsp")}
	
    def testimonials() {render(view: "testimonials.gsp")}
    
    def events() {render(view: "events.gsp")}
	
	def contact() {render(view: "contact.gsp")}
    
    def inquire() {
        def emailName = params.get("inquirer_name")
        def emailAddress = params.get("inquirer_email");
        def emailBody = params.get("inquirer_message");
        def emailSubject = params.get("inquirer_subject");
        EmailController emailer = new EmailController(emailName); 
        emailer.performInquiryAction(emailAddress, emailSubject, emailBody);
        return [ sender: emailName, email : emailAddress ]
    }

}
