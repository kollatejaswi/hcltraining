package hcl;

public class Event {
	String name;
	String details;
	String ownerName;
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(String name, String details, String ownerName) {
		super();
		this.name = name;
		this.details = details;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void details()
	{
	   System.out.println("event name:"+this.name);
	   System.out.println("event details:"+this.details);
	   System.out.println("event owner name:"+this.ownerName);
	}
}
