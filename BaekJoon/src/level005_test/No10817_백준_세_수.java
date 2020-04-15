package level005_test;

import java.util.Arrays;
import java.util.Scanner;

public class No10817_백준_세_수 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);

	}

}
