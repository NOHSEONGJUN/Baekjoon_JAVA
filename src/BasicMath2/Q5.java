package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] checkPrimeNum = new boolean[246912];

		checkPrimeNum[0] = true;
		for (int i = 2; i * i <= 246912; i++) {
			if (!checkPrimeNum[i - 1]) {
				for (int j = i * i; j <= 246912; j += i) {
					checkPrimeNum[j - 1] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = bf.readLine();
			if(str.equals("0")) {
				break;
			}
			int n = 2 * Integer.parseInt(str);
			
			int count = 0;
			for(int j = n / 2; j < n; j++) {
				if(!checkPrimeNum[j]) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}

}
