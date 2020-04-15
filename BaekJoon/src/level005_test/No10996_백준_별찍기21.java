package level005_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No10996_백준_별찍기21 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println("*");
		}else {
			int allLineCount = N*2;
			
			for(int i=1; i<=allLineCount; i++) {
				for(int j=1; j<=N; j++) {
					if(i%2 == 1) {
						// 홀수 줄인 경우
						if(j%2 == 1) {
							//별부터 시작
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}else {
						// 짝수 줄인 경우
						if(j%2 == 1) {
							//공백부터 시작
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
