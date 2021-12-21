import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		while((str = bf.readLine()) != null) {
			int[] count = new int[4];
			for(int i = 0; i < str.length(); i++) {
				if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
					count[0]++;
				} else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
					count[1]++;
				} else if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					count[2]++;
				} else {
					count[3]++;
				}
			}
			for(int j = 0; j < 4; j++) {
				sb.append(count[j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
