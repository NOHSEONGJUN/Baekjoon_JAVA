import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];
		String str = bf.readLine();
		for(int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			sb.append(alpha[i]).append(" ");
		}
		System.out.println(sb);
	}

}
