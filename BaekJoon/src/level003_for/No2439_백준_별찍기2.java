package level003_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439_백준_별찍기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}
