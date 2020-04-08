package level3_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2739_백준_구구단 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
	}

}
