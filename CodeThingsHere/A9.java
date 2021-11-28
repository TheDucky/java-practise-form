import java.util.Scanner;

public class A9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input First Number: ");
        double fn = scan.nextDouble();

        System.out.print("Input Second Number: ");
        double sn = scan.nextDouble();

        System.out.print("Input Third Number: ");
        double tn = scan.nextDouble();

        double avg = (fn + sn + tn) / 3;
        System.out.println("The Average of The 3 Numbers is: " + avg);
    }
}

/*
9. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/