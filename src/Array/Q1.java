package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		int max, min;
		int[] numArray = new int[num];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < num; i++) {
			numArray[i] = Integer.parseInt(st.nextToken());
		}
		
		max = numArray[0];
		min = numArray[0];
		for(int i = 1; i < num; i++) {
			if(max < numArray[i]) {
				max = numArray[i];
			} else if(min > numArray[i]) {
				min = numArray[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}
	