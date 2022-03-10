import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TikTok {

    public static void main(String[] args) throws InterruptedException {
        while (true) {

            LocalTime tik = LocalTime.now();
            DateTimeFormatter tok = DateTimeFormatter.ofPattern("hh:mm:ss a ");
            String time = tik.format(tok);
            System.out.print("\r" + time);
            Thread.sleep(100);
        } 
    }
}
