import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the distance --> ");
        double dis = scan.nextDouble();
        System.out.print("enter the time --> ");
        double tim = scan.nextDouble();
        scan.close();
        double speed = dis/tim;
        System.out.println("speed --> " + speed);
    }
}