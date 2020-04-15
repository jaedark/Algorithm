package level006_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class No3052_백준_나머지 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] saveArr = new int[10];
		for(int i=0; i < 10; i++) {
			saveArr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i < 10; i++) {
			set.add(saveArr[i]);
		}
		
		System.out.println(set.size());
	}
}
