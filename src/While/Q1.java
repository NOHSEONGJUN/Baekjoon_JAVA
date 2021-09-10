package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A, B;
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(bf.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) {
				break;
			}
			System.out.println((A + B));
		}
		
	}

}
