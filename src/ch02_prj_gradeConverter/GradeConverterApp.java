package ch02_prj_gradeConverter;

import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello, scanner
		System.out.println("Welcome to the letter grade converter");
		Scanner sc = new Scanner(System.in);

		// Variables
		String choice = "y";
		int numericalGrade = 0;
		// user prompt
		// System.out.println("Continue? (y/n)");
		// choice = sc.next();
		// while loop
		while (!choice.equalsIgnoreCase("n")) {

			System.out.println("Enter numerical grade:  ");
			numericalGrade = sc.nextInt();
			// if statements to generate letter grade
			if (numericalGrade >= 88) {
				System.out.println("Letter Grade: A");

			} else if (numericalGrade <= 87 && numericalGrade >= 80) {
				System.out.println("Letter Grade: B");

			} else if (numericalGrade <= 79 && numericalGrade >= 67) {
				System.out.println("Letter Grade: C");

			} else if (numericalGrade <= 67 && numericalGrade >= 60) {
				System.out.println("Letter Grade: D");

			} else {
				System.out.println("Letter Grade: F");

			}
			System.out.print("Continue? (y/n): ");
			choice = sc.next();

		}
		sc.close();
		System.out.println("GoodBye");

	}
}