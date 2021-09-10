import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 1; i < N + 1; i++) {
			list.add(i);
		}
		ListIterator<Integer> iter = list.listIterator();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = 0; i < N; i++) {
			for(int j = 1; j < K; j++) {
				if(!iter.hasNext()) {
					iter = list.listIterator();
					iter.next();
				}else {
					iter.next();
				}
			}
			if(!iter.hasNext()) {
				iter = list.listIterator();
			}
			sb.append(iter.next()).append(", ");
			iter.remove();
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");
		System.out.println(sb);
	}

}
