package level008_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No11720_백준_숫자의합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String checkStr = br.readLine();
		int sum = 0;
		for(int i=0; i<N; i++) {
			char tmpChar = checkStr.charAt(i);
			sum += Integer.parseInt(String.valueOf(tmpChar));
		}
		
		System.out.println(sum);
	}
}
