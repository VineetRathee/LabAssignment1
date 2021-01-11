package Assignment1;

import java.util.Scanner;

public class GradesAverageTester {
	private int  numStudents;
	private int grades[];
	
	GradesAverageTester(){
		
	}
	GradesAverageTester(int numStudents){
		this.numStudents=numStudents;
		grades = new int[numStudents];
	}
	void CheckGrades() {
		int number=this.numStudents;
		int countStudents=0;
		Scanner obj = new Scanner(System.in);
		double Sum=0;
		while(countStudents< number) {
			System.out.println("Enter the grade for student "+ countStudents);
			int input =obj.nextInt();
			
			grades[countStudents]=input;
			if(input>=0&&input<=100) {
				countStudents++;
			}
			else {
				System.out.println("Invalid grade, try again... ");
			}
			
		}
		obj.close();
	}
	void average() {
		CheckGrades();
		double sum=0;
		for(int i=0;i<grades.length;i++) {
			sum=sum+grades[i];
		}
		System.out.println("The average is: " + sum/this.numStudents);
		
	}
	

}
