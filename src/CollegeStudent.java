
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
		String str;
		str = String.format("College Student: %s MAJOR: %s GPA: %.2f", name, major, getGPA());
		return str;
	}
	
	//String str = String.format("College Student: %s MAJOR: %s GPA: %s", this.name, this.major, getGPA());
}
