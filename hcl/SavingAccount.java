package hcl;

public class SavingAccount extends AccountDetails {
	double minimunBalance;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(String  accountNumber,double balance,String accountHolderName,double minimunBalance) {
		super(accountNumber,balance,accountHolderName);
		this.minimunBalance = minimunBalance;
	}
	public double getMinimunBalance() {
		return minimunBalance;
	}
	public void setMinimunBalance(double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}
	

}
