package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
		
		if (stu.finalGrade() >= 60) {
		
				System.out.println("PASS ");
		}
		else {
			
			System.out.println("FAILED ");
			System.out.printf("MISSING %.2f POINTS", stu.missingPoints());
		}
		
		
		
	}

}
