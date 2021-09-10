import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		LinkedList<Character> linkedList = new LinkedList<Character>();
		for(int i = 0; i < str.length(); i++) {
			linkedList.add(str.charAt(i));
		}
		ListIterator<Character> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		int testCase = Integer.parseInt(bf.readLine());
		for(int i = 0; i < testCase; i++) {
			String commend = bf.readLine();
			char c = commend.charAt(0);
			switch(c) {
				case 'L' :
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					break;
				case 'D' :
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					break;
				case 'B' :
					if(listIterator.hasPrevious()) {
						listIterator.previous();
						listIterator.remove();
					}	
					break;
				case 'P' :
					listIterator.add(commend.charAt(2));
					break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c : linkedList) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}