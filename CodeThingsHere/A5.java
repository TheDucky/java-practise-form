import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {
        System.out.println("~~ MULTIPLYING NUMBERS ~~");
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int fn = scan.nextInt();
        System.out.print("Input Second Number: ");
        int sn = scan.nextInt();

        int sum = fn * sn;
        System.out.println(fn + " x " + sn + " = " + sum);
    }
}

/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
