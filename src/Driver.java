import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Person> people = new ArrayList<Person>();
		int count = 0;
		String tempName = "";
		int tempAge = 0;
		String tempSubject = "";
		String isFullTime = "";
		boolean tempBool;
		String temp = "";
		int credits = 0;
		double gpa = 0;
		
		Scanner fin = new Scanner(new File("input.io"));
		
		
		//System.out.println(fin.next());
		/*for(int i = 0; i < people.length; i++) {
			
		}*/
		
		while(fin.hasNextLine() && count < 12) {
			temp = fin.next();
			if(temp.equals("C")) {
				people.add(new CollegeStudent(fin.next(), fin.nextInt(), fin.next(), fin.next()));
				//System.out.println("poop");
			}
			else if(temp.equals("H")) {
				people.add(new HighSchoolStudent(fin.next(), fin.nextInt(), fin.next()));
			}
			else if(temp.equals("T")) {
				tempName = fin.next();
				tempAge = fin.nextInt();
				tempSubject = fin.next();
				isFullTime = fin.next();
				
				if(isFullTime.equals("F")) {
					tempBool = true;
				}
				else {
					tempBool = false;
				}
				
				people.add(new Teacher(tempName, tempAge, tempSubject, tempBool));
			}
		}
		
		for(int i = 0; i < people.size(); i++) {
			if(people.get(i) instanceof CollegeStudent) {
				credits = (int)(Math.random() * 60 + 1);
				gpa = (double)(Math.random() * 4);
				((CollegeStudent) people.get(i)).addCredits(credits);
				((CollegeStudent) people.get(i)).addQualityPoints(gpa);
			}
			if(people.get(i) instanceof HighSchoolStudent) {
				credits = (int)(Math.random() * 60 + 1);
				gpa = (double)(Math.random() * 4);
				((HighSchoolStudent) people.get(i)).addCredits(credits);
				((HighSchoolStudent) people.get(i)).addQualityPoints(gpa);
			}
		}
		
		for(int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).toString());
		}
		
		
	}

}
