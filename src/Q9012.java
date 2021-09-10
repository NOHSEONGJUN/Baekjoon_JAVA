import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < testCase; i++) {
			String str = bf.readLine();
			if(isVPS(str)) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static boolean isVPS(String str) {
		char[] charArray = str.toCharArray();
		int i = 0;
		for(char c : charArray) {
			if(c == '(') {
				i++;
			} else if(c == ')') {
				i--;
			}
			if(i < 0) {
				return false;
			}
		}
		if(i == 0) {
			return true;
		} else {
			return false;
		}
	}

}
