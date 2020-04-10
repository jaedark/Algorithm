package level003_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871_백준_X보다작은수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i < N; i++) {
			int tempNumber = Integer.parseInt(st.nextToken());
			if(tempNumber < X) {
				System.out.print(tempNumber + " ");
			}
		}

	}

}
