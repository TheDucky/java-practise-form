import java.util.Scanner; 

public class B4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");

        double n1 = scan.nextInt();
        double n2 = scan.nextInt();
        double n3 = scan.nextInt();

        double avg = (n1 + n2 + n3) / 3;

        System.out.println("average of the 3 numbers is: " + avg);

    }
}

// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.