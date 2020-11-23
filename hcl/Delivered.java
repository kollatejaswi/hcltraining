package hcl;

public class Delivered {

	  Long over;
	  Long ball;
	  Long run;
    String batsman;
    String blower;
    String nonStriker;
    public Delivered() {
		// TODO Auto-generated constructor stub
	}
	public Delivered(Long over, Long ball, Long run, String batsman, String blower, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.run = run;
		this.batsman = batsman;
		this.blower = blower;
		this.nonStriker = nonStriker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRun() {
		return run;
	}
	public void setRun(Long run) {
		this.run = run;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBlower() {
		return blower;
	}
	public void setBlower(String blower) {
		this.blower = blower;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
    
}
