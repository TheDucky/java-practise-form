import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {

        // Perimeter = 2*π*r
        // Area = π*r2
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Circle Radious: ");
        double rad = scan.nextDouble();

        double prei = 2 * Math.PI * rad;
        double ar = Math.PI * Math.pow(rad,2);

        System.out.println("Perimeter is = " + prei);
        System.out.println("Area is = " + ar);
    }
}

/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
