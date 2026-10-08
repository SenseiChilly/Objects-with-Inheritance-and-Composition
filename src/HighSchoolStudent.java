
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
		String str;
		str = String.format("HS Student: %s GPA: %.2f", name, getGPA());
		return str;
	}
}
