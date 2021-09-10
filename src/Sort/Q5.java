package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		char[] n = input.toCharArray();
		Arrays.sort(n);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n.length; i++) {
			sb.append(n[i]);
		}
		sb.reverse();
		System.out.println(sb);
	}

}
