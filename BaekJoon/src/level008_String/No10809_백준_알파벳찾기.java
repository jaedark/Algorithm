package level008_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No10809_백준_알파벳찾기 {
	static final char[] alphabet = {'a','b','c','d','e'};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String S = br.readLine();
		
		//97~122 a ~ z
		for(int i=97; i<=122; i++) {
			char alphabet = (char) i;
			if(S.contains(String.valueOf(alphabet))) {
				System.out.print(S.indexOf(alphabet) + " ");
			}else {
				System.out.print("-1 ");
			}
		}
	}
}
