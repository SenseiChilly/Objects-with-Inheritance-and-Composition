
public class Teacher extends Person {
	
	private String subject;
	private boolean fullTime;
	
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
		String ft;
		String str;
		
		if(fullTime == true) {
			ft = "FT";
		}
		else {
			ft = "PT";
		}
		
		str = String.format("TEACHER: %s SUBJECT: %s (%s)", this.name, this.subject, ft);
		return str;
	}
}
