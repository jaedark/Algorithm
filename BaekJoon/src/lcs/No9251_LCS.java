package lcs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No9251_LCS {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = "";
		String str2 = "";
		
		str1 = br.readLine();
		str2 = br.readLine();
		
		//LCS값을 저장하기 위한 DP배열 생성
		int[][] DP = new int[str1.length()+1][str2.length()+1];
		
		//LCS 계
		for(int i=1; i<=str1.length(); i++) {
			for(int j=1; j<=str2.length(); j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					//동일한경우 대각선 + 1
					DP[i][j] = DP[i-1][j-1] + 1;
				}else {
					// 그 이외의 경우 좌,상 MAX값
					DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
				}
				
			}
		}
		
		System.out.println(DP[str1.length()][str2.length()]);
		
	}

}
