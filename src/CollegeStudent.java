
public class CollegeStudent extends Student{

	private String major;
	private int totalCredits;
	private double totalQualityPoints;
	
	public CollegeStudent(String name, int age, String id, String major) {
		super(name, age, id);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String otherMajor) {
		major = otherMajor;
	}
	
	public void addCredits(int credits) {
		totalCredits += credits;
	}
	
	public void addQualityPoints(double qps) {
		totalQualityPoints += qps;
	}
	
	public double getGPA() {
		return totalQualityPoints/totalCredits;
	}

	@Override
	public String toString() {
		return "College Student: " + this.name + " " + "MAJOR: " + this.major + " " + "GPA: " + getGPA();
	}
}
