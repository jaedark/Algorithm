package level005_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2446_백준_별찍기9 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <=N-1; i++) {
			for(int j=0; j <i; j++) {
				System.out.print(" ");
			}
			for(int j=2*(N-i)-1; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = N-1; i > 0; i--) {
			for(int j=i-1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j <=2*(N-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
