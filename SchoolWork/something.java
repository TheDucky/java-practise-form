import java.util.Scanner;

public class something{ //Main
 
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("pls enter integer: ");
        int entrd = scan.nextInt();
        scan.close();

        double round = Math.round(entrd);
        System.out.println("closest whole number = " + round);
        for (int i = 1; i > round; i = i + 2) {
		    System.out.println(i + "\n");
        } 


    }
}