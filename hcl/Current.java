package hcl;

public class Current extends Account {
	private String tinNumber;
	public Current() {
		// TODO Auto-generated constructor stub
	}
	public Current(String accName,String accNo,String bankName,String tinNumber) {
		super(accName, accNo, bankName);
		this.tinNumber=tinNumber;
	}
	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

}
