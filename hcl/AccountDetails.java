package hcl;

public class AccountDetails {
	String  accountNumber;

	double balance;

	String accountHolderName;
	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(String accountNumber, double balance, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	

}
