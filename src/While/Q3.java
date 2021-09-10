package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(bf.readLine());
		int n2;
		int cycle = 1;
		if(n1 < 10) {
			n1 *= 10;
		}
		n2 = n1 % 10 * 10 + (n1 / 10 + n1 % 10) % 10;

		while(n1 != n2) {
			n2 = n2 % 10 * 10 + (n2 / 10 + n2 % 10) % 10;
			cycle++;
		}
		
		System.out.println(cycle);	
	}

}
