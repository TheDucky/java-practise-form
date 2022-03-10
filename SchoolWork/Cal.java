import java.util.Scanner;

public class Cal {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int Fnum = number.nextInt();
        System.out.print("Enter the second number:");
        int Snum = number.nextInt();
        Scanner symbol = new Scanner(System.in);
        System.out.println("Enter the symbol:" + "\n +, -, *, /");
        String sym = symbol.nextLine();
        number.close();
        symbol.close();

        if (sym.equals("+")) {
            System.out.println(Fnum + " + " + Snum + " = " + (Fnum+Snum));
        }else if (sym.equals("-")) {
            System.out.println(Fnum + " - " + Snum + " = " + (Fnum-Snum));
        }else if (sym.equals("*")) {
            System.out.println(Fnum + " * " + Snum + " = " + (Fnum*Snum));
        }else if (sym.equals("/")) {
            System.out.println(Fnum + " / " + Snum + " = " + (Fnum/Snum));
        }else {
	        System.out.println("invalid entry, try again! @_@");
        }
    }
}
