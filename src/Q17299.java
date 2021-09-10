import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17299 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		int[] n = new int[testCase];
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < testCase; i++) {
			n[i] = Integer.parseInt(st.nextToken());
			if(n[i] > max) {
				max = n[i];
			}
		}
		int[] timeN = new int[max];
		for(int i = 0; i < testCase; i++) {
			timeN[n[i] - 1]++;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < testCase; i++) {
			while(!stack.isEmpty() && timeN[n[stack.peek()] - 1] < timeN[n[i] - 1]) {
				n[stack.pop()] = n[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			n[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			sb.append(n[i]).append(" ");
		}
		System.out.println(sb);
	}
	
}