package IO;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A , B;
		
		A = sc.nextInt();
		B = sc.nextInt();

		System.out.println(A * Character.getNumericValue(String.valueOf(B).charAt(2)));
		System.out.println(A * Character.getNumericValue(String.valueOf(B).charAt(1)));
		System.out.println(A * Character.getNumericValue(String.valueOf(B).charAt(0)));
		System.out.println(A * B);
	}

}