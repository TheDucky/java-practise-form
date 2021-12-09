import java.util.Scanner; 

public class B5 {

    public static void main(String[] args) {

        Scanner BBQ = new Scanner(System.in);

        System.out.print("Enter Width: ");
        double wi = BBQ.nextDouble();

        System.out.print("Enter Height: ");
        double hi = BBQ.nextDouble();

        double area = wi * hi;
        double peri = (wi + hi) * 2;

        System.out.println("Area is " + wi + " * " + hi + " = " + area);
        System.out.println("Perimeter is 2 * (" + wi + " + " + hi + ") = " + peri);
    }
}

/*
13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

