package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No8958_백준_OX퀴즈 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] arr = new String[T];
		for(int i=0; i<T; i++) {
			arr[i] = br.readLine();
		}
		
		//char배열로 변경 후, for문을 돌리면서 점수를 체크한다. 체크변수를 두어 연속으로 O가 나올경우 ++ 하면서 저장
		for(int i=0; i<T; i++) {
			int checkValue = 0;
			int sum = 0;
			char[] charArr = arr[i].toCharArray();
			
			for(int j=0; j<charArr.length; j++) {
				if(charArr[j] == 'O') {
					checkValue++;
					sum += checkValue;
				}
				else {
						checkValue = 0;		
				}
			}
			
			System.out.println(sum);
		}
	}

}
