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
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('%', 2);
		map.put('(', 3);
		map.put(')', 3);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if('A' <= c && c <= 'Z') {
				sb.append(c);
			} else if(stack.empty()){
				stack.push(c);
			} else if(c == '(') {
					stack.push(c);
			} else if(c == ')') {
				while(stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else if(map.get(stack.peek()) < map.get(c)) {
					sb.append(c);
			} else {
				while(map.get(stack.peek()) < map.get(c)) {
					if(c == '(') {
						break;
					}
					sb.append(stack.pop());
				}
			}
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}

}
