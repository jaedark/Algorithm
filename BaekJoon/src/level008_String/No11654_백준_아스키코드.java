package level008_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No11654_백준_아스키코드 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		System.out.println(Integer.valueOf(tmp.charAt(0)));
		
	}

}
