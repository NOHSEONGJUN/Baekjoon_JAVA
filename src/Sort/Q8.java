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
				if(o1.length() == o2.length()) {    // �� �ܾ��� ���̰� �������
					return o1.compareTo(o2);
					// �ߺ��ϰ�� 0�� ��ȯ
					// TreeSet�� 0�� ��ȯ�ɰ�� �ߺ��̹Ƿ� ���� �߰����� ����
				} else {
					return o1.length() - o2.length();    // �� �ܾ��� ���̰� �ٸ� ���
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
