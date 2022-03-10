import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0, num2 = 1, uni;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to loop: ");
        int l = scan.nextInt();
        System.out.print(num1 + "\t" + num2);
        
        for(int i = 2; i < l; ++i) {    
        uni = num1 + num2;    
        System.out.print("\t" + uni);    
        num1 = num2;    
        num2 = uni;    
        }
    }
}

// to print fibonacci series up to end terms 