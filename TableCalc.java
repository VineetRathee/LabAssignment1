package Assignment1;

import java.util.Scanner;

public class TableCalc {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int number =obj.nextInt();
		TableTester Table = new TableTester(number);
		Table.makeTable();
		Table.ShowTable();
		
	}
	

}
