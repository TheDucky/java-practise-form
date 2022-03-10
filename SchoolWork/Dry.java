import java.util.Scanner;

public class Dry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter any number: ");
        int raw = scan.nextInt();
        int fnl = 0;

        while (raw > 0) {
            int lst = raw % 10;
            fnl = fnl + lst;
            raw = raw / 10;
        }

        System.out.println(fnl);
    }
}