package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q9 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		String[][] data = new String[testCase][2];
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			data[i][0] = st.nextToken();
			data[i][1] = st.nextToken();
		}
		Arrays.sort(data, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			sb.append(data[i][0]).append(" ").append(data[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
