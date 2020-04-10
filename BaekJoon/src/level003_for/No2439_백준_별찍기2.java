package level003_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2439_백준_별찍기2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int blank = N-i;
			int star = i;
			
			for(int j=0; j<blank; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
