package hcl;

public class Account {
protected String accName;
protected String accNo;
protected String bankName;
 public Account() {
	// TODO Auto-generated constructor stub
}
public Account(String accName, String accNo, String bankName) {
	super();
	this.accName = accName;
	this.accNo = accNo;
	this.bankName = bankName;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public void display()
{
	System.out.println("accountname:"+accName);
	System.out.println("accountno:"+accNo);
	System.out.println("bankname:"+bankName);
}
}
