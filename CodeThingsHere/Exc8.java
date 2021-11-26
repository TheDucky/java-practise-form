import java.util.Scanner;

public class Exc8 {

    public static void main(String[] args) {

        //(°F − 32) × 5/9 = °C
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double fr = scan.nextDouble();

        double cl = (fr - 32) * 5/9;
        System.out.print("Fahrenheit = " + fr + "| Celsius = " + cl);
    }
}



/*
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/