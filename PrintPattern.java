package Assignment1;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int level = obj.nextInt();
		PrintPatternTester pattern = new PrintPatternTester(level);
		pattern.pattern();
		
	}

}
