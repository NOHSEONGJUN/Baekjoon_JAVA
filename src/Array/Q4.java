package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArray = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			numArray[i] = Integer.parseInt(bf.readLine()) % 42;
		}
		
		for(int i = 0, j; i < 10; i++) {
			for(j = 0; j < i; j++) {
				if(numArray[j] == numArray[i]) {
					break;
				}
			}
			if(i == j) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
