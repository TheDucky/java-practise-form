import java.util.Scanner;

public class ThePower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter number for the loop: ");
        int l = scan.nextInt();

        for(int i = 1; i <= l; i++) {
            int o = (int)Math.pow(i, 2);
            System.out.print(o + "  ");
        }
    }
}