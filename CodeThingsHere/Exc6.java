import java.util.Scanner;

public class Exc6
{
    public static void main(String[] args)
    {
        System.out.println("~~ ALL MATH PROCEDURES ~~");
        Scanner sc = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int fn = sc.nextInt();
        System.out.print("Input Second Number: ");
        int sn = sc.nextInt();

        int add = fn + sn;
        int sub = fn - sn;
        System.out.println("~~ OUTPUT ~~\n");
        System.out.println(fn + " + " + sn + " = " + add);
        System.out.println(fn + " - " + sn + " = " + sub);

    }
}


/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
