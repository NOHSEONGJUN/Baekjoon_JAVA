package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		int[][] n = new int[testCase][2];
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			n[i][0] = Integer.parseInt(st.nextToken());
			n[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		    	if(o1[1] == o2[1]) {
		    		return o1[0] - o2[0];
		    	} else {
		    		return o1[1] - o2[1];
		    	}
		    }
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			sb.append(n[i][0]).append(" ").append(n[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}