package puppiesplusk9.email;

public class InquiryCopyEmail extends AbstractEmail {
    
    public InquiryCopyEmail(name, email, subject, body) {
       super(name, [email], subject, body);
       this.fromAddress = NO_REPLY_ADDRESS;
    }
    
    protected String buildSubject(name, subject) {
        return "PuppiesPlusK9: Subject -> " + subject;
    }
    
    protected String buildBody(body) {
        return "This is an automated message. \n\n" +
        "Thank you for submitting an email. I will try to contact you as soon as possible.\n\n" + 
        "Below is a copy of your message:\n\n\n" + body;
    }
}