import java.util.Scanner;

public class B1Q2 {

    public static void main(String[] args) {
        System.out.println("~~ ADDING 2 NUMBERS ~~");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int fn = scan.nextInt();
        System.out.print("Enter Second Number:");
        int sn = scan.nextInt();
        scan.close();

        int ans = fn + sn;
        System.out.println(fn + " + " + sn + " = " + ans);
    }
}

/*
2. Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110
*/