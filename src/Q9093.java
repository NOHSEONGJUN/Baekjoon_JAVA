import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int count = st.countTokens();
			for(int j = 0; j < count; j++) {
				sb.append(reverse(st.nextToken())).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		return str;
	}
}
