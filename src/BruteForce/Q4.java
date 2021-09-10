package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {

	static boolean[][] board;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int count = 64;
		board = new boolean[x][y];
		for(int i = 0; i < x; i++) {
			String str = bf.readLine();
			for(int j = 0; j < y; j++) {
				if(str.charAt(j) == 'W') {
					board[i][j] = true;
				} else {
					board[i][j] = false;
				}
			}
		}
		
		int maxX = x - 7;
		int maxY = y - 7;
		for(int i = 0; i < maxX; i++) {
			for(int j = 0; j < maxY; j++) {
				count = Math.min(count, reColor(i, j));
			}
		}
		
		System.out.println(count);
	}
	
	static int reColor(int x, int y) {
		int count = 0;
		int maxX = x + 8;
		int maxY = y + 8;
		boolean TF = true;
		
		for(int i = x; i < maxX; i++) {
			for(int j = y ; j < maxY; j++) {
				if(board[i][j] == TF) {
					count++;
				}
				TF = !TF;
			}
			TF = !TF;
		}
		
		return Math.min(count, 64 - count);
	}
}