package Assignment1;

public class Que1Tester {
	public static void main(String[] args) {
		int n=20;
		Que1Helper Fibo = new Que1Helper(n);
		Fibo.fibo();
		int avg= Fibo.avg();
		System.out.println();
		System.out.println(avg);
	}

}
