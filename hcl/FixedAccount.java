package hcl;

public class FixedAccount extends SavingAccount {
	int lockingPeriod;
	public FixedAccount() {
		// TODO Auto-generated constructor stub
	}
	public FixedAccount(String  accountNumber,double balance,String accountHolderName,double minimunBalance,int lockingPeriod) {
		super(accountNumber,balance,accountHolderName,minimunBalance);
		this.lockingPeriod = lockingPeriod;
	}
	public int getLockingPeriod() {
		return lockingPeriod;
	}
	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}


}
