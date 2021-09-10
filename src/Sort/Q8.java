package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Q8 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());
		TreeSet<String>	word = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {    // 두 단어의 길이가 같을경우
					return o1.compareTo(o2);
					// 중복일경우 0을 반환
					// TreeSet은 0이 반환될경우 중복이므로 값을 추가하지 않음
				} else {
					return o1.length() - o2.length();    // 두 단어의 길이가 다를 경우
				}
			}
		});
		
		for(int i = 0; i < testCase; i++ ) {
			word.add(bf.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		for(String obj : word) {
			sb.append(obj).append("\n");
		}
		
		System.out.println(sb);
	}

}
