package puppiesplusk9.email;

protected abstract class AbstractEmail implements Email {
    public String body;
    
    public String subject;
    
    public String fromAddress;

    public String[] toAddresses;
    
    private String emailName;
    
    protected AbstractEmail(name, email, subject, body) {
        emailName = name;
        this.toAddresses = email;
        this.body = buildBody(body);
        this.subject = buildSubject(name, subject);
    }
    
    protected static String[] INTERNAL_ADDRESSES = ["marchele@puppiesplusk9.com", "shadowstorm50@gmail.com"];
    protected static String NO_REPLY_ADDRESS = "no-reply@puppiesplusk9.com";
    
    protected abstract String buildBody(body);
    
    protected abstract String buildSubject(name, subject);
}
 
