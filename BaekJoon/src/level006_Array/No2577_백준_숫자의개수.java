package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2577_백준_숫자의개수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long multipleResult = 0;
		multipleResult = Integer.parseInt(br.readLine());
		for(int i=0; i < 2; i++) {
			multipleResult *= Integer.parseInt(br.readLine());
		}
		
		String str = String.valueOf(multipleResult);
		int[] checkArr = new int[10];
		for(int i=0; i < str.length(); i++) {
			 checkArr[Integer.parseInt(str.charAt(i)+"")]++;
		}
		
		for(int i=0; i < checkArr.length; i++) {
			 System.out.println(checkArr[i]);
		}
	}

}
