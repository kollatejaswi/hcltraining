package hcl;

public class Exhibition extends Event {
int noOfstall;
public Exhibition() {
	// TODO Auto-generated constructor stub
}
public Exhibition(String name,String details,String ownerName,int noOfstall) {
	super(name,details,ownerName);
	this.noOfstall = noOfstall;
}
public int getNoOfstall() {
	return noOfstall;
}
public void setNoOfstall(int noOfstall) {
	this.noOfstall = noOfstall;
}
public void print()
{
	super.details();
	System.out.println("no of stalls:"+noOfstall);
}
}
