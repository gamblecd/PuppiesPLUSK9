package puppiesplusk9.email;

public interface Email {
    public body;
    
    public subject;
    
    public String fromAddress;

    public String[] toAddresses;
	
	public String getBody();
	public String getSubject();
	public String getFrom();
	public String[] getTo();

}

