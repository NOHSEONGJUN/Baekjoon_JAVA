package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		int max = 0;
		double aver = 0;
		int[] scores = new int[num];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < num; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		
		for(int i = 0; i < num; i++) {
			aver += (double)scores[i] / (double)max * 100.0;
		}
		
		aver = aver / (double)num;
		System.out.println(aver);
	}

}
