import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int back = 0;
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String commend = st.nextToken();
			switch(commend) {
				case "push" :
					int num = Integer.parseInt(st.nextToken());
					queue.add(num);
					back = num;
					break;
				case "pop" :
					if(queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.remove()).append("\n");
					}
					break;
				case "size" :
					sb.append(queue.size()).append("\n");
					break;
				case "empty" :
					if(queue.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
				case "front" : 
					if(queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.peek()).append("\n");
					}
					break;
				case "back" :
					if(queue.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(back).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
	}

}
