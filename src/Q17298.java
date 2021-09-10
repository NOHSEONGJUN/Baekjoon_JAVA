import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int testCase = Integer.parseInt(bf.readLine());
		int[] intArray = new int[testCase];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < testCase; i++) {
			intArray[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < testCase; i++) {	
			while(!stack.isEmpty() && intArray[stack.peek()] < intArray[i]) {
				intArray[stack.pop()] = intArray[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			intArray[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			sb.append(intArray[i]).append(" ");
		}
		System.out.println(sb);
	}

}