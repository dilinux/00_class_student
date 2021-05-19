package entities;

public class Student {
	public double grade1;
	public double grade2;
	public double grade3;
	public double gradeFinal;
	public double minimumGrade = 60.0;
		
	
	public void calculate() {
		gradeFinal = grade1 + grade2 + grade3;
				
		if (gradeFinal >= minimumGrade) {
			System.out.println("FINAL GRADE = " + gradeFinal);
			System.out.println("PASS");
		}else {
				System.out.println("FINAL GRADE = " + gradeFinal);
				System.out.println("FAILED");
				System.out.println("MISSING " + (minimumGrade-gradeFinal) + " POINTS");
			}
			
		}
	
}
