package puppiesplusk9.email;

public class InquiryEmail extends EmailImpl {
   
    
    protected InquiryEmail() {}
    
	@Override
	protected Email buildTo(String[] addresses) {
		return super.buildTo(INTERNAL_ADDRESSES);
	}
	
	@Override
    protected Email buildSubject(name, subject) {
        return super.buildSubject("New Inquiry From Website -> " + name + ": " + subject)
    }
	
	@Override
	protected Email buildBody(String body) {
		return super.buildBody(body + "\n\nREPLY TO: " + this.fromAddress); 
	}

}
