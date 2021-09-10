package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());
		int[] count = new int[10];
		for(int i = 0; i < 10; i++) {
			count[i] = 0;
		}
		
		A = A * B * C;
		
		for(int i = 0; i < String.valueOf(A).length(); i++) {
			count[Character.getNumericValue(String.valueOf(A).charAt(i))]++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}

}
