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
		String[] addresses = new String[1];
		addresses[0] = address;
        sendEmail(EmailImpl.Builder.buildInquiry(addresses, address, subject, body));
        sendEmail(EmailImpl.Builder.buildInquiryCopy(addresses, "", subject, body));
    }

    private sendEmail(Email mail) {
        sendMail {
            from mail.fromAddress
            to mail.toAddresses
            subject mail.subject
            body mail.body
        }
    }
}