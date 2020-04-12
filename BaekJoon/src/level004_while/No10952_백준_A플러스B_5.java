package level004_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10952_백준_A플러스B_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		while(flag) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				flag = false;
			}else {
				System.out.println((A+B));				
			}
		}
	}
}
