package For;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j  < n; j++) {
				System.out.print(" ");
			}
			for(int j = -1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}