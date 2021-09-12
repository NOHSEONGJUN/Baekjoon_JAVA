import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Q1918 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Integer> operPriority = new HashMap<Character, Integer>();
		operPriority.put('+', 1);
		operPriority.put('-', 1);
		operPriority.put('*', 2);
		operPriority.put('/', 2);
		operPriority.put('%', 2);
		operPriority.put('(', 3);
		operPriority.put(')', 3);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if('A' <= c && c <= 'Z') {
				sb.append(c);
			} else if(stack.isEmpty()) {
				stack.push(c);
			} else if(c == ')') {
				while(stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && operPriority.get(stack.peek()) >=operPriority.get(c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}

}
