package For;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, T;
		
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (A + B));
		}
	}

}
