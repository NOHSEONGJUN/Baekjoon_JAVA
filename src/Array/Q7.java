package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int numOfTest = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numOfTest; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int numOfScores = Integer.parseInt(st.nextToken());
			int[] scores = new int[numOfScores];
			double aver = 0;
			double percent = 0;
			for(int j = 0; j < numOfScores; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				aver += scores[j];
			}
			aver = aver / (double)numOfScores;
			for(int j = 0; j < numOfScores; j++) {
				if(scores[j] > aver) {
					percent++;
				}
			}
			percent = percent / (double)numOfScores * 100.0;
			sb.append(String.format("%.3f", percent)).append("%").append("\n");
		}
		
		System.out.println(sb);
	}

}
