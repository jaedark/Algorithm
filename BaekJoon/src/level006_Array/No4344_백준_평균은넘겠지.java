package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4344_백준_평균은넘겠지 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 학생수 N
			int N = Integer.parseInt(st.nextToken());
			// 점수 배열 저장
			int[] scoreArr = new int[N];
			// 평균 저장을 위해 sum 변수 선언
			int sum = 0;
			for(int j=0; j<scoreArr.length; j++) {
				int score = Integer.parseInt(st.nextToken());
				scoreArr[j] = score;
				sum += score;
			}
			
			//평균 계산
			double avg = (double) sum / N ;
			
			//평균을 이용하여 학생들을 비교하며 평균 아래 비율 계산
			int winnerCount = 0;
			for(int k = 0; k < N; k++) {
				if(avg < scoreArr[k]) {
					winnerCount++;
				}
			}
			
			double result = ((double) winnerCount / (double) N) * 100 ;
			System.out.println(String.format("%.3f", result) + "%");
			
			
		}
	}

}
