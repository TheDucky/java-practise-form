import java.util.Scanner;

public class One {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("this is my first java project on linux" + "\nplease enter any 2 number");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int res = a + b;
        System.out.println("sum of " + a + " and " + b + " = " + res);

    }
}
