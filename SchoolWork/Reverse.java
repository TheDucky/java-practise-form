import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int inp, ext, rev=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        inp = scan.nextInt();

        while(inp > 0) { 
            ext = inp % 10; 
            rev = rev * 10 + ext; 
            inp = inp / 10;  
        }
        System.out.println("the reverse of your input = " + rev);
    }
}