package puppiesplusk9.email;

protected class EmailImpl implements Email {
    protected String body;
    
    protected String subject;
    
    protected String fromAddress;

    protected String[] toAddresses;
    
    protected String emailName;
	
	protected EmailImpl() {}
    
    protected static String[] INTERNAL_ADDRESSES = ["marchele@puppiesplusk9.com", "shadowstorm50@gmail.com"];
    protected static String NO_REPLY_ADDRESS = "no-reply@puppiesplusk9.com";
	
	@Override
	public String getBody() {
		return body;
	}

	@Override
	public String getSubject() {
		return subject;
	}

	@Override
	public String getFrom() {
		return fromAddress;
	}

	@Override
	public String[] getTo() {
		return toAddresses;
	}
    
	protected Email build(String[] toAddresses, String fromAddress, String subject, String body) {
		return buildTo(toAddresses).buildFrom(fromAddress).buildSubject(subject).buildBody(body);
	}
	
	protected Email buildBody(String body) {
		this.body = body;
		return this;
	}
	
    protected Email buildSubject(String subject) {
		this.subject = subject;
		return this;
	}
	protected Email buildFrom(String address) {
		this.fromAddress = address;
		return this;
	}
	
	protected Email buildTo(String[] addresses) {
		this.toAddresses = addresses;
		return this;
	}
	
	public static class Builder {
		public static Email buildEmail(String[] toAddresses, String fromAddress, String subject, String body) {
			Email email = new EmailImpl();
			return email.build(toAddresses, fromAddress, subject, body);
		}
		
		public static Email buildInquiry(String[] toAddresses, String fromAddress, String subject, String body) {
			InquiryEmail email = new InquiryEmail();
			return email.build(toAddresses, fromAddress, subject, body);
		}
		
		public static Email buildInquiryCopy(String[] toAddresses, String fromAddress, String subject, String body) {
			InquiryCopyEmail email = new InquiryCopyEmail();
			return email.buildFrom(fromAddress).buildTo(toAddresses).buildSubject(subject).buildBody(body);
		}
	}
}
 
