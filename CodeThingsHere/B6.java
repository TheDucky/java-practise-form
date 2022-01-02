import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {

        int a, b, swap;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("before number swap \n" + "num1 = " + a + " | num2 = " + b);

        swap = a;
        a = b;
        b = swap;
        System.out.println("after number swap \n" + "num1 = " + a + " | num2 = " + b);
      
    }
}

// 15. Write a Java program to swap two variables. 