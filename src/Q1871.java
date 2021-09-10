import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1871 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		int[] inputSequence = new int[testCase];
		for(int i = 0; i < testCase; i++) {
			inputSequence[i] = Integer.parseInt(bf.readLine());
		}
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int i = 0;
		int n = 1;
		while(i != testCase) {
			if(stack.lastElement() < inputSequence[i]) {
				sb.append("+\n");
				stack.push(n++);
			} else if(stack.lastElement() == inputSequence[i]) {
				sb.append("-\n");
				stack.pop();
				i++;
			} else {
				sb.setLength(0);
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);
	}

}
