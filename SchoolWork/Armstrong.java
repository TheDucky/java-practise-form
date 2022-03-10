import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int tkn, fnl = 0, arm = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        tkn = scan.nextInt();
        int Fod = tkn;

        while (tkn > 0) {
            int lst = tkn % 10;
            arm = (int)Math.pow(lst, 3);
            fnl = fnl + arm;
            tkn = tkn / 10;
        }

        System.out.println(fnl);

        if(fnl == Fod) {
            System.out.println("this is a Armstrong number.");
        }else {
            System.out.println("this is not a Armstrong number.");
        }
    }
}