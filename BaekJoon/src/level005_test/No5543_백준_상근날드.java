package level005_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No5543_백준_상근날드 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minBurgerPrice = Integer.MAX_VALUE;
		int minCokePrice = Integer.MAX_VALUE;
		
		
		for(int i=0; i<5; i++) {
			int checkValue = Integer.parseInt(br.readLine());
			if(i>=0 && i<3) {
				if(checkValue < minBurgerPrice) {
					minBurgerPrice = checkValue;
				}
			}else {
				if(checkValue < minCokePrice) {
					minCokePrice = checkValue;
				}
			}
		}
		
		System.out.println(minBurgerPrice + minCokePrice -50);
	}

}
