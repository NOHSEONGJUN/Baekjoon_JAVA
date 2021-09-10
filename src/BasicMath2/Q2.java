package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(bf.readLine());
		int n2 = Integer.parseInt(bf.readLine());
		int sum = 0;
		int minPrimeNum = n2;
		
		if(n1 == 1) {
			n1++;
		}
		for(; n1 <= n2; n1++) {
			for(int i = 2; i <= n1; i++) {
				if(n1 % i == 0 && n1 != i) {
					break;
				}
				if(n1 <= i * i) {
					sum += n1;
					if(minPrimeNum > n1) {
						minPrimeNum = n1;
					}
					break;
				}
			}
		}
		
		if(sum > 0) {
			System.out.println(sum);
			System.out.println(minPrimeNum);
		} else {
			System.out.println(-1);
		}
	}

}