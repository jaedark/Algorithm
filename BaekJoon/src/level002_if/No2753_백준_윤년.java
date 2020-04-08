package level002_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2753_백준_윤년 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int day = Integer.parseInt(br.readLine());
		
		if(day % 4 == 0 && (!(day % 100 == 0) || (day % 400 == 0))) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
