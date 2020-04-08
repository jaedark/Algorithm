package level001_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2588_백준_곱셈{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		//���� �ڸ� ��
		int hundred = B/100;
		//���� �ڸ� ��
		int ten = (B - hundred*100) / 10;
		//���� �ڸ� ��
		int one = (B - hundred*100 - ten*10);

		System.out.println(A*one);
		System.out.println(A*ten);
		System.out.println(A*hundred);
		System.out.println(A*one + ((A*ten)*10) + (A*hundred)*100);	
	}

}
