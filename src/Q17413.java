import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] charArray = bf.readLine().toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '<') {
				while(true) {
					i++;
					if(charArray[i] == '>') {
						break;
					}
				}
			} else {
				int start = i;
				while(i < charArray.length && charArray[i] != '<' && charArray[i] != ' ') {
					i++;
				}
				revers(charArray, start, i - 1);
				if(i < charArray.length && charArray[i] == '<') {
					i--;
				}
			}
			
		}	
		System.out.println(charArray);
	}
	
	static void revers(char[] charArray, int start, int end) {
		for(; start < end; start++, end--) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
		}
	}

}
