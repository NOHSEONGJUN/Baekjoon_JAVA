import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] suffix = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			suffix[i] = str.substring(i);
		}
		Arrays.sort(suffix);
		for(int i = 0; i < str.length(); i++) {
			System.out.println(suffix[i]);
		}
	}

}
