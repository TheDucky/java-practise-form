/* Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0)
and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1)
and 171 is divisible by 9. */

import java.util.Scanner;

public class Harshad {

    public static void main(String[] args) {

        int tkn, fnl = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        tkn = scan.nextInt();
        int Fod = tkn;

        while (tkn > 0) {
            int lst = tkn % 10;
            fnl = fnl + lst;
            tkn = tkn / 10;
        }

        int dev = Fod % fnl;

        if(dev == 0) {
            System.out.println("this is a Harshad number.");
        }else {
            System.out.println("this is not a Harshad number.");
        }
    }
}