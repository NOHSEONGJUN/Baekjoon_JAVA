import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q22877 {
	static boolean compare(char A, char B) {
		if(A == 'R' && B == 'S') {
			return true;
		}
		if(A == 'S' && B == 'P') {
			return true;
		}
		if(A == 'P' && B == 'R') {
			return true;
		}
		return false;
	}
	
	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		char[] arr = new char[n];
		arr = bf.readLine().toCharArray();
		for(int i = 0; i < n - 1; i++) {
			for(int j = i; j > i - t && j > -1; j--) {
				if (compare(arr[j], arr[j + 1])) {
					swap(arr, j, j + 1);
				} else {
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}

}