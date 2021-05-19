package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.println("Enter the grade 2: ");
		student.grade2 = sc.nextDouble();

		System.out.println("Enter the grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		student.calculate();
			
						
	}			

}
