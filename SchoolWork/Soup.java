import java.util.Random;
import java.util.Scanner;

public class Soup {
    public static void main(String[] args) {
        while(true) {
            Random ran = new Random();
            int num = ran.nextInt(6);
            Scanner scan = new Scanner(System.in);
            System.out.println("Try to guess the number from 0 to 5");
            int guess = scan.nextInt();

            if (num == guess) {
                System.out.println("congratulations! you guessed right");
            } else {
                System.out.println("you guessed wrong" + "\nthe number was " + num);
            }
        }
    }
}
