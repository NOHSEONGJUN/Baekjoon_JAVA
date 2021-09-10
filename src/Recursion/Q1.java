package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if(n < 2) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

}
