package level008_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2675_백준_문자열반복 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String tmpStr = st.nextToken();
			char[] tmpArr = tmpStr.toCharArray();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<tmpArr.length; i++) {
				for(int j=0; j<R; j++) {
					sb.append(tmpArr[i]);
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}
