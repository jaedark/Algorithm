package level004_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1110_백준_더하기싸이클 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int changeBefore = N;
		int changeAfterN = Integer.MAX_VALUE;
		int count = 0;
		
		while(changeAfterN != N) {
			if(count != 0) {
				changeBefore = changeAfterN;				
			}
			// 십의 자리 수 구하기
			int tendigit = changeBefore / 10;
			// 일의 자리 수 구하기
			int onedigit = changeBefore % 10;
			// 합
			int tempSum = tendigit + onedigit;
			
			changeAfterN = onedigit*10 + tempSum%10;
			count++;
		}
		
		System.out.println(count);
	}

}
