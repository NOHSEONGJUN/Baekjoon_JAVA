package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] data = new int[n][2];
		int[] rank = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i; j < n; j++) {
				if(data[i][0] > data[j][0] && data[i][1] > data[j][1]) {
					rank[j]++;
				} else if(data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
					rank[i]++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(rank[i] + 1).append(" ");
		}
		System.out.println(sb);
	}

}
