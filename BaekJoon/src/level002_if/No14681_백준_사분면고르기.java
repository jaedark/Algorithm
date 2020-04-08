package level002_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No14681_백준_사분면고르기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x*y > 0) {// 1,3 �и��� ���
			if(y > 0) {//1
				System.out.println("1");
			}else {
				System.out.println("3");
			}
		}else { // 2,4 �и��� ���
			if(y > 0) {
				System.out.println("2");
			}else {
				System.out.println("4");
			}
		}
	}

}
