package puppiesplusk9.email;

public class InquiryCopyEmail extends EmailImpl {
    
    protected InquiryCopyEmail() {}
	
	@Override
	protected Email buildFrom(String address) {
		return super.buildFrom(NO_REPLY_ADDRESS);
	}
    
	@Override
    protected Email buildSubject(String subject) {
        return super.buildSubject("PuppiesPlusK9: Subject -> " + subject);
    }
    
	@Override
    protected Email buildBody(String body) {
        return super.buildBody("This is an automated message. \n\n" +
        "Thank you for submitting an email. I will try to contact you as soon as possible.\n\n" + 
        "Below is a copy of your message:\n\n\n" + body);
    }
}