package level3_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2741_백준_N찍기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			
			sb.append(i + "\n");
		}
		
		System.out.println(sb.toString());

	}

}
