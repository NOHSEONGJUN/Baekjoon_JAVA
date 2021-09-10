package For;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, x;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(x > num) {
				sb.append(num).append(" ");
			}
		}
		
		System.out.println(sb);
	}

}
