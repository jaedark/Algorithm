package io_problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1008_����_A������B {
	static double A, B;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Double.parseDouble(st.nextToken());
		B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
	}

}
