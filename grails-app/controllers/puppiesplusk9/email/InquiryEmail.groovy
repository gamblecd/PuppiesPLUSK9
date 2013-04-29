package puppiesplusk9.email;

public class InquiryEmail extends AbstractEmail {
   
    
    public InquiryEmail(name, email, subject, body) {
        super(name, INTERNAL_ADDRESSES, subject, body);
        this.fromAddress = NO_REPLY_ADDRESS;
    }
    
    protected String buildSubject(name, subject) {
        return "New Inquiry From Website -> " + name + ": " + subject;
    }
    
    protected String buildBody(body) {
        return body + "\n\nREPLY TO: " + this.fromAddress;
    }
}
