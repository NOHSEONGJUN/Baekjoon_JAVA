package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(countAP(Integer.parseInt(bf.readLine())));
	}
	
	public static int countAP(int num) {
		int count = 0;
		
		if(num < 100) {
			count = num;
		} else {
			if(num == 1000) {
				num = 999;
			}
			count = 99;
			for(int i = 100; i < num + 1; i++) {
				int hun = i / 100;
				int ten = i % 100 / 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		
		return count;
	}
}


//public class Q3 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int count = 0;
//		int num = Integer.parseInt(bf.readLine());
//		
//		for(int i = 1; i < num + 1; i++) {
//			if(checkAP(i) == true) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//	
//	public static boolean checkAP(int num) {
//		int d;
//		d = num % 10 - (num / 10) % 10;
//		if(num == 1000) {
//			return false;
//		}
//		for(int i = 0; i < String.valueOf(num).length(); i++) {
//			 if(d != num % 10 - (num / 10) % 10) {
//				 return false;
//			 }
//			 num = num / 10;
//		}
//		
//		return true;
//	}
//}
