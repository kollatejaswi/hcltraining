package hcl;

public class Saving extends Account {
private String orgName;

public Saving() {
	// TODO Auto-generated constructor stub
}
public Saving(String accName,String accNo,String bankName,String orgName) {
	super(accName, accNo, bankName);
	this.orgName=orgName;
}
public String getOrgName() {
	return orgName;
}

public void setOrgName(String orgName) {
	this.orgName = orgName;
}

}
