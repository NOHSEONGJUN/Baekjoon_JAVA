package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		if (n != 1) {
			for (int i=2; i * i <= n; i++) {
				while (n % i == 0) {
					n /= i;
					sb.append(i).append("\n");
				}
			}
		}
		if(n > 1) {
			sb.append(n);
		}
		
		System.out.println(sb);
	}

}
