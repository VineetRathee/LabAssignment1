package Assignment1;

import java.util.Scanner;

public class CopyOfArray {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int arr[] = new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=obj.nextInt();
		}
		int newarr[]=CopyArray.makeArray(arr);
		arr[0]=5;
		arr[1]=2;
		for(int temp: newarr) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		for(int temp: arr) {
			System.out.print(temp + " ");
		}
	}

}
