import java.util.Scanner;

public class B1Q3 {

    public static void main(String[] args) {
        System.out.println("~~ DIVIDING 2 NUMBERS ~~");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend Number:");
        int Dividend = sc.nextInt();
        System.out.print("Enter Divisor Number:");
        int Divisor = sc.nextInt();
        sc.close();

        int Quotient = Dividend / Divisor;
        System.out.println(Dividend + " / " + Divisor + " = " + Quotient);
    }
}

/*
3. Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16
*/



