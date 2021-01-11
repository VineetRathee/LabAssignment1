package Assignment1;

public class PrintPatternTester {
	private int level;
	public PrintPatternTester() {
		
	}
	public PrintPatternTester(int level) {
		this.level = level;
	}
	void pattern() {
		for(int i=1;i<=this.level;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
			
		}
	}
	

}
