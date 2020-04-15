package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1546_백준_평균 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] scoreArr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i < N; i++) {
			scoreArr[i] = Integer.parseInt(st.nextToken());
		}
		//최대값을 구하기 위해 sorting
		Arrays.sort(scoreArr);
		
		// 계산 적용 - 계산식을 적용하여 덧셈
		int maxScore = scoreArr[scoreArr.length-1];
		double sum = 0;
		for(int i=0; i < N; i++) {
			sum += (double) scoreArr[i] /(double) maxScore * 100;
		}
		
		System.out.println(sum/(double) N);
	}

}
