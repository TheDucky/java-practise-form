import java.util.Scanner;

public class NoPower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter number for the loop: ");
        int l = scan.nextInt();
        System.out.print("please enter number for division: ");
        int a = scan.nextInt();

        for(int i = 1; i <= l; i++) {
            int sum = a / l;
            System.out.println(sum);
        }
    }
}

//sum=a/2+a/3+a/4+...n