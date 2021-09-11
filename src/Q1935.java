import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1935 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		String str = bf.readLine();
		
		double[] operand = new double[n];
		for(int i = 0; i < n; i++) {
			operand[i] = Double.parseDouble(bf.readLine());
		}
		
		Stack<Double> stack = new Stack<Double>();
		for(int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			
			if('A' <= c && c <= 'Z') {
				stack.push(operand[c - 'A']);
			} else {
				double post = stack.pop();
				double pre = stack.pop();
				switch (c) {
					case '+':
						stack.push(pre + post);
						break;
					case '-':
						stack.push(pre - post);
						break;
					case '*':
						stack.push(pre * post);
						break;
					case '/':
						stack.push(pre / post);
						break;
				}
			}
		}
		
		System.out.println(String.format("%.2f", stack.pop()));
	}

}
