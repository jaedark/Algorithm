package level001_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1008_백준_A나누기B {
	static double A, B;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Double.parseDouble(st.nextToken());
		B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
	}

}
