package level3_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No8393_백준_합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<=N; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
