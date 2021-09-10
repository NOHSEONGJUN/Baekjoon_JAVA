package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int[] n = new int[st.countTokens()];
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum(n));
	}

	public static long sum(int[] n) {
		long sum = 0;
		for(int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum;
	}
}
