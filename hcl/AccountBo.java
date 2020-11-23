package hcl;

public class AccountBo {
	FixedAccount f=new FixedAccount();
public void details(String s)
{
	String c3[]=s.split(",");
	f.setAccountNumber(c3[0]);
	f.setBalance(Double.valueOf(c3[1]));
    f.setAccountHolderName(c3[2]);
    f.setMinimunBalance(Double.valueOf(c3[3]));
    f.setLockingPeriod(Integer.valueOf(c3[4]));
    System.out.println("bank details:");
    System.out.println("account name:"+"\t"+"balance"+"\t"+"account holder name"+"\t"+"minimun balance"+"\t"+"lockingperoid");
    System.out.println(f.getAccountHolderName()+"\t"+f.getBalance()+"\t"+f.getAccountNumber()+"\t"+f.getMinimunBalance()+"\t"+f.getLockingPeriod());
}
}
