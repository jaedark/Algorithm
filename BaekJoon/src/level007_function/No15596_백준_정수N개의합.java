package level007_function;

public class No15596_백준_정수N개의합 {

	public static void main(String[] args) {
	
	}

	public static long sum(int[] a) {
		long result = 0;
		
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
}
