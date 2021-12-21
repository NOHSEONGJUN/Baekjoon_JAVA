import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long num1 = Long.parseLong(st.nextToken() + st.nextToken());
		long num2 = Long.parseLong(st.nextToken() + st.nextToken());
		
		long result = num1 + num2;
		
		System.out.println(result);
	}

}
