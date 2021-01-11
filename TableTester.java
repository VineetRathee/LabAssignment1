package Assignment1;

public class TableTester {
	private int number ;
	private int arr[][];
	
	
	
	public TableTester() {
	}

	public TableTester(int number) {
		//super();
		this.number = number;
		arr = new int[number+1][number+1];
	}
	void makeTable() {
		for(int i=1;i<=this.number;i++) {
			for(int j=1;j<=this.number;j++) {
				arr[i][j]=i*j;
			}
		}
		
	}
	void ShowTable() {
		for(int i=1;i<=this.number;i++) {
			for(int j=1;j<=this.number;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
