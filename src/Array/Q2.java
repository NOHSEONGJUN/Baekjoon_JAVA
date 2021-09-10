package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, count = 0;
		int[] numArray = new int[9];
		
		for(int i = 0; i < 9; i++) {
			numArray[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 0; i < 9; i ++) {
			if(max < numArray[i]) {
				max = numArray[i];
				count = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
	}

}
