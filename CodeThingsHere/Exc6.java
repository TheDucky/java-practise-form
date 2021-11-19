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
        int mlt = fn * sn;
        int dev = fn / sn;
        int rmd = fn % sn;

        System.out.println("~~ OUTPUT ~~\n");
        System.out.println(fn + " + " + sn + " = " + add);
        System.out.println(fn + " - " + sn + " = " + sub);
        System.out.println(fn + " x " + sn + " = " + mlt);
        System.out.println(fn + " / " + sn + " = " + dev);
        System.out.println(fn + " mod " + sn + " = " + dev);
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
