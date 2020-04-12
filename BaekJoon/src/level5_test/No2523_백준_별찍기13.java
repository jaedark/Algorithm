package level5_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2523_백준_별찍기13 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=N-1; i>=1; i--) {
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
