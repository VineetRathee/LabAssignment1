package Assignment1;

import java.util.Scanner;

public class GradesAverage {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int number =obj.nextInt();
		GradesAverageTester grades = new GradesAverageTester(number);
		grades.average();
		
	}

}
