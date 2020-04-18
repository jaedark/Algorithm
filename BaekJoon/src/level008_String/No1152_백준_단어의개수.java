package level008_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1152_백준_단어의개수 {

	  static StringTokenizer st;

	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));

	      while (true) {
	         st = new StringTokenizer(br.readLine());
	         int a = Integer.parseInt(st.nextToken());
	         int b = Integer.parseInt(st.nextToken());

	         if (a == 0 && b == 0) {
	            break;

	         } else {
	            int sum=65;
	            bw.write(sum);
	            //System.out.println(sum);
	            bw.newLine();
	            
	         }
	         
	      }
	      bw.flush();
	      bw.close();

	   }
}
