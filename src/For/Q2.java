package For;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, T;
		
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A + B);
		}
	}

}
