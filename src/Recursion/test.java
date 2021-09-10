package Recursion;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = new int[6];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println(Arrays.toString(c));
		
		int[][] a1 = {{1, 2, 3}, {7, 8, 9}};
		int[][] b1 = {{4, 5, 6}, {10, 11, 12}};
		System.out.println(Arrays.toString(a1));
	}

}
