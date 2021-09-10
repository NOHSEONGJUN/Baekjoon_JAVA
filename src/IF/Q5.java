package IF;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H, M;
		
		H = sc.nextInt();
		M = sc.nextInt();
		
		M -= 45;
		if(M < 0) {
			M += 60;
			H -= 1;
			if(H < 0) {
				H = 23;
			}
		}
		
		System.out.println(H + " " + M);
	}

}