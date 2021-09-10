package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int i = n - ((int)Math.log10(n) + 1) * 9;
		for( ; i < n; i++) {
			int tempNum1 = i;
			int tempNum2 = i;
			while(tempNum2 != 0) {
				tempNum1 += tempNum2 % 10;
				tempNum2 /= 10;
			}
			if(tempNum1 == n) {
				System.out.println(i);
				break;
			}
		}
		
		if(i == n) {
			System.out.println(0);
		}
	}

}
