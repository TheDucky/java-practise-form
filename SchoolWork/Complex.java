import java.util.Scanner;

public class Complex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 3 numbers");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        if (a > b && a > c) {
            System.out.println(a +" is largest");
        } else if (b > a && b > c) {
            System.out.println(b +" is largest");
        } else {
            System.out.println(c +" is largest");
        }
    }
}