//swap 2 numbers and print them out 

import java.util.Scanner;

public class NumSwap {

    public static void main(String[] args) {

        int num1, num2, uni;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();

        System.out.println("num1 = " + num1 + " | num2 = " + num2);

        uni = num1;
        num1 = num2;
        num2 = uni;
    
        System.out.println("num1 = " + num1 + " | num2 = " + num2);
      
    }
}