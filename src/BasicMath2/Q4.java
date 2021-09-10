package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		boolean[] checkPrimeNum = new boolean[n2];

		checkPrimeNum[0] = true;
		for (int i = 2; i * i <= n2; i++) {
			if (!checkPrimeNum[i - 1]) {
				for (int j = i * i; j <= n2; j += i) {
					checkPrimeNum[j - 1] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = n1 - 1; i < n2; i++) {
			if(!checkPrimeNum[i]) {
				sb.append(i + 1).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
