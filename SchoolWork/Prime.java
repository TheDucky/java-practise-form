import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {

		int n, div = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the 'n' value: ");
		n = scan.nextInt();

		for(int i = 1; i <= n; i++) {

			if(n%i == 0) {
				div++;
			}
		}

		if(div == 2) {
			System.out.println("entered number is a prime number");
		}else {
			System.out.println("entered number is not a prime number");
		}
	}

}
