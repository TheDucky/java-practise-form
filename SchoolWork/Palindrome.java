import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int inp, ext, rev=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        inp = scan.nextInt();
        int first = inp;

        while(inp > 0) {
            ext = inp % 10;
            rev = rev * 10 + ext;
            inp = inp / 10;   
        }
        System.out.println("the  of your input = " + rev);

        if(first == rev) {
            System.out.println("input is a palindrome number");
        }else {
            System.out.println("input is not a palindrome number");
        }
    }
}