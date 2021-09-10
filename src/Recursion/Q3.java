package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		arr = new char[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}
		
		drawStar(n, 0, 0);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	static void drawStar(int n, int x, int y) {
		if(n == 1){
			arr[x][y] = '*';
			return;
		} else {
			n /= 3;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j ++) {
					if(i == 1 && j == 1) {
					} else {
						drawStar(n, i * n + x, j * n + y);
					}
				}
			}
		}
	}
}
