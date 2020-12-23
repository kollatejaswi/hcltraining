package course;

public class CourseList {
    private int id;
    private String name;
    private String mentor;
    private Integer fee;
    public CourseList() {
		// TODO Auto-generated constructor stub
	}
	public CourseList(int id, String name, String mentor, Integer fee) {
		super();
		this.id = id;
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
    
}
