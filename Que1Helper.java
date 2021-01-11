package Assignment1;

public class Que1Helper {
	private int n;
	private int Sum;
	
	public Que1Helper() {
		
	}

	public Que1Helper(int n) {
		//super();
		this.n = n;
		Sum=0;
	}
	void fibo() {
		int n=this.n;
		int first=1,second=0,sum=0;
	Sum=0;
		    for(int i = 1; i <= n; i++) 
		    { 
		          
		       //Add the previous 2 numbers  
		       // in the series and store it 
		       sum = first + second; 
		       System.out.print(sum + " ");
		       Sum=Sum+sum;
		       first=second;
		       second=sum;
		    } 
			
		}
	int avg() {
		fibo();
		return Sum/20;
		
	}
	}
	


