package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] num = new int[n];
		int nearestNum = 0;
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
	
		for(int i =  0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					int tempNum = num[i] + num[j] + num[k];
					if(tempNum > m) {
						break;
					}
					if(m - nearestNum > m - tempNum) {	
						nearestNum = tempNum;
					}
				}
			}
		}
		
		System.out.println(nearestNum);
	}

}