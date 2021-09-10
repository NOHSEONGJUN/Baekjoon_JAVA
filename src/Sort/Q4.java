package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int mean = 0, midian, mode = 0, range;
		int[] count = new int[8001];
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(bf.readLine());
			mean += data[i];
			
		}
		
		Arrays.sort(data);
		
		mean = (int)Math.round((double)mean / (double)n);
		midian = data[n / 2];
		range = data[n - 1] - data[0];
		
		boolean TF = false;
		for(int i = 0, max = 0; i < n; i++) {
			int temp = data[i] + 4000;
			count[temp]++;
			if(max < count[temp]) {
				max = count[temp];
				mode = temp;
				TF = false;
			} else if(count[mode] == count[temp] && mode != temp && !TF) {
				mode = temp;
				TF = true;
			}
		}
		mode -= 4000;
		
		System.out.println(mean);
		System.out.println(midian);
		System.out.println(mode);
		System.out.println(range);
	}

}
