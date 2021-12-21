import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004 {
	static int fiveCount(int n) {
		 int count = 0;

		 for (long i = 5; n / i >= 1; i *= 5) {
			 count += n / i;
		 }
		 
		 return count;
	}
	
	static int twoCount(int n) {
		int count = 0;

		 for (long i = 2; n / i >= 1; i *= 2) {
			 count += n / i;
		 }
		 
		 return count;
	}
	
	static int min(int n1, int n2) {
		if(n1 > n2) 
			return n2;
		else 
			return n1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int five = fiveCount(n);
		if(m != 0) five -= fiveCount(m);
		if(n != m) five -= fiveCount(n - m);
		int two = twoCount(n);
		if(m != 0) two -= twoCount(m);
		if(n != m) two -= twoCount(n - m);
		
		int zero = min(five, two);
		System.out.println(zero);
	}
}
