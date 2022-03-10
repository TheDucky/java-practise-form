//see if a number is positive, negative or equal to 0

import java.util.Scanner;

public class NumCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int num = scanner.nextInt();
        scanner.close();

        if(num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");
        } else if (num == 0) {
            System.out.println("number is equal to 0");
        } else {
            System.out.println("input is not valid");
        }
    }
}