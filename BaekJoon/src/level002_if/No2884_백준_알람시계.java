package level002_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2884_백준_알람시계 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//분으로 변환
		int sum = H*60 + M;
		int result = sum - 45;
		
		if(result < 0) {
			result = result + (24*60);
		}
		
		//시간 분으로 변환
		int resultH = result/60;
		int resultM = result - resultH*60;
		//결과
		System.out.println(resultH + " " + resultM);
	}

}
