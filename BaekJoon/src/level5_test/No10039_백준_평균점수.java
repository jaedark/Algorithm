package level5_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No10039_백준_평균점수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 점수 합계 저장 변수
		int sum = 0;
		for(int i=0; i<5; i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			if(tmp < 40) {
				tmp = 40;
			}
			
			sum += tmp;
		}
		
		System.out.println(sum/5);
	}
}
