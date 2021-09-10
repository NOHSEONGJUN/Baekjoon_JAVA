package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] num = new int[n];
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
			
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 1) {
				n--;
			} else {
				for(int j = 2; j * j <= num[i]; j++) {
					if(num[i] % j == 0 && num[i] != j) {
						n--;
						break;
					}
				}
			}
		}
		
		System.out.println(n);
	}

}