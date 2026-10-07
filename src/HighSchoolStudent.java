
public class HighSchoolStudent extends Student{
	
	private int totalCredits;
	private double totalQualityPts;
	
	public HighSchoolStudent(String name, int age, String id) {
		super(name, age, id);
	}
	
	public void addCredits(int credits) {
		totalCredits += credits;
	}
	
	public void addQualityPoints(double pts) {
		totalQualityPts += pts;
	}
	
	public double getGPA() {
		return totalQualityPts/totalCredits;
	}

	@Override
	public String toString() {
		return "HS Student: " + this.name + " " + "GPA: " + getGPA();
	}
}
