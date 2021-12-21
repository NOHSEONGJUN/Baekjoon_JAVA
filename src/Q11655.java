import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] str = bf.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			if('A' <= str[i] && str[i] <= 'Z') {
				str[i] += (char)13;
				if(str[i] > 'Z') {
					str[i] -= (char)26;
				}
			} else if('a' <= str[i] && str[i] <= 'z') {
				str[i] += (char)13;
				if(str[i] > 'z') {
					str[i] -= (char)26;
				}
			}
			sb.append(str[i]);
		}
		
		System.out.println(sb);
	}

}
