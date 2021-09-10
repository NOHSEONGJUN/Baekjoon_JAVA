package For;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A, B, T;
		
		T = Integer.valueOf(bf.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			A = Integer.valueOf(st.nextToken());
			B = Integer.valueOf(st.nextToken());
			
			bw.write(String.valueOf(A + B) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
