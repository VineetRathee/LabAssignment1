package Assignment1;

public class CopyArray {
	
		public static int[] makeArray(int []arr) {
			int []newarr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				newarr[i]=arr[i];
			}
			return newarr;
		}
	

}
