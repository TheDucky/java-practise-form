import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {

		int n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the 'n' value: ");
		n = scan.nextInt();

		for(int i = 1; i < n; i++) {

			if(n%i == 0) {
				sum = sum + i;
			}
		}

		if(sum == n) {
			System.out.println("entered number is a perfect number");
		}else {
			System.out.println("entered number is not a perfect number");
		}
	}

}
