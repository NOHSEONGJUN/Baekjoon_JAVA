import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		ArrayList<Integer> stack = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			switch(st.nextToken()) {
				case "push":
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if(stack.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.remove(stack.size() - 1)).append("\n");
					}
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					int size;
					if(stack.size() == 0) {
						size = 1;
					} else {
						size = 0;
					}
					sb.append(size).append("\n");
					break;
				case "top":
					if(stack.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.get(stack.size() - 1)).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
	}

}
