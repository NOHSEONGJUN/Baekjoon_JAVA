import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			deque.offer(i + 1);
		}
		st = new StringTokenizer(bf.readLine());
		int count = 0;
		for(int i = 0; i < m; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(deque.peek() == x) {
				deque.pollFirst();
			} else {
				int halfIndex = deque.size() / 2;
				if(halfIndex >= deque.indexOf(x)) {
					while(deque.peek() != x) {
						deque.offer(deque.pollFirst());
						count++;
					}
				} else {
					while(deque.peek() != x) {
						deque.offerFirst(deque.pollLast());
						count++;
					}
				}
				deque.pollFirst();
			}
		}
	
		System.out.println(count);
	}
}
