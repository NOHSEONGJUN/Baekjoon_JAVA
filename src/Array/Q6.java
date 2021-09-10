package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			String str = bf.readLine();
			char[] OXResult = new char[str.length()];
			
			for(int j = 0; j < str.length(); j++) {
				OXResult[j] = str.charAt(j);
			}
			
			int point = 0;
			int score = 0;
			for(int j = 0; j < str.length(); j++) {
				if(OXResult[j] == 'O') {
					score += ++point;
				} else {
					point = 0;
				}
			}
			
			sb.append(score).append("\n");
		}
		
		System.out.println(sb);
	}

}