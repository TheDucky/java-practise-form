import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {

        int d, max, min;

        Scanner scan = new Scanner(System.in);
        System.out.print("enter any number: ");
        int raw = scan.nextInt();

        max = 0;
        min = 9;

        while(raw > 0) {

            d = raw % 10;
            if(d > max) {
                max = d;
            } 
            if(d < min) {
                min = d;
            }
            raw = raw / 10;
        }
        System.out.println("max digit = " + max);      
        System.out.println("min digit = " + min);
    }
}

// take an input and find the max and min digits in the number!