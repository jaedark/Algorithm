package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class No2562_백준_최댓값 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1; i <= 9; i++) {
			int inputData = Integer.parseInt(br.readLine());
			arr[i] = inputData;
			map.put(inputData, i);
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(map.get(arr[arr.length-1]));
	}

}
