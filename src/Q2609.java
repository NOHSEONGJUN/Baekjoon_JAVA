import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int gcd = 0;
		int lcm = 0;
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		int temp1 = n1;
		int temp2 = n2;
		while(true) {
			if(temp1 % temp2 == 0) {
				gcd = temp2;
				break;
			} else {
				int temp = temp1 % temp2;
				temp1 = temp2;
				temp2 = temp;
			}
		}
		lcm = n1 * n2 / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
	}

}
