
public class Teacher extends Person {
	
	private String subject;
	private boolean fullTime;
	private String ft;
	
	public Teacher(String name, int age, String subject, boolean fullTime) {
		super(name, age);
		this.subject = subject;
		this.fullTime = fullTime;
		
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String otherSubject) {
		this.subject = otherSubject;
	}
	
	public boolean isFullTime() {
		return fullTime;
	}
	
	public void setFullTime(boolean otherFullTime) {
		this.fullTime = otherFullTime;
	}

	@Override
	public String toString() {
		return "TEACHER: " + this.name + " " + "SUBJECT: " + this.subject + " " + "(" + "ppop" + ")";
	}
	
}
