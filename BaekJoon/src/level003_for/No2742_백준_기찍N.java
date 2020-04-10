package level003_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2742_백준_기찍N {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=T; i>=1; i--) {
			
			sb.append(i + "\n");
		}
		
		System.out.println(sb.toString());

	}

}
