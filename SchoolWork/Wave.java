public class Wave {

    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i <= 20; i++) {

            System.out.print("\r ( ^_^)/  hello i am waving ");
            Thread.sleep(500);
            System.out.print("\r ( ^_^)__ hello i am waving ");
            Thread.sleep(500);
        }
    }
}