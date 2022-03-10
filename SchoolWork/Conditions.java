//use if and else statement 

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("enter your age");

        int age = Scan.nextInt();
        Scan.close();
        
        if (age >= 18) 
        System.out.print("you can vote");
        else 
        System.out.print("you are not old enough to vote");
        
    }
}

