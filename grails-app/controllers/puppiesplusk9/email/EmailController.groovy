package puppiesplusk9.email

import puppiesplusk9.email.Email.*;

public class EmailController {

    private String sender;
    
    public EmailController() {
        this({});
    }
    
    public EmailController(sender) {
        this.sender = sender;
    }
    
    public void performInquiryAction(address, subject, body) {
        sendEmail(new InquiryEmail(sender, address, subject, body));
        sendEmail(new InquiryCopyEmail(sender, address, subject, body));
    }

    private sendEmail(AbstractEmail mail) {
        sendMail {
            from mail.fromAddress
            to mail.toAddresses
            subject mail.subject
            body mail.body
        }
    }
}