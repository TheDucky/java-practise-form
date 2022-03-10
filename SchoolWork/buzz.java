import java.util.Scanner;

public class buzz {

    public static void main(String[] args) {

        // buzz = 7
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();

        int buzz = r % 7; 
        int test = r % 10;

        if(buzz == 0 || test == 7) {
            System.out.println("buzz!");
        } else {
            System.out.println("no buzz!");
        }
    }
}