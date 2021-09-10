import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] charArray = bf.readLine().toCharArray();
		int count = 0;
		int underRazer = 0;
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '(') {
				if(charArray[i + 1] == ')') {
					i++;
					count += underRazer;
				} else {
					count++;
					underRazer++;
				}
			} else {
				underRazer--;
			}
		}
		System.out.println(count);
	}

}
