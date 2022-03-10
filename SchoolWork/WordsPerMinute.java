import java.util.Random;
import java.util.Scanner;

public class WordsPerMinute {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    static String[] word = {"honey", "the", "cup", "hound", "roof", "beer", "words", "chicken", "if", "chrome", "music", "dog","ugly", "duck","about","above","add","after","again","air","all","almost","along","also","always","an","and","animal","another","answer","any","are","around","as","ask","at","away","back","be","because","been","before","began","begin","below","between","big","book","both","boy","but","by","call","came","can","car","carry","change","children","city","close","come","could","country","cut","day","did","different","do","does","don't","down","each","earth","eat","end","enough","even","every","example","eye","face","family","far","father","feet","few","find","first","follow","food","for","form","found","four","from","get","girl","give","go","good","got","great","group","grow","had","hand","hard","has","have","he","head","hear","help","her","here","hig","him","his","home","house","how","idea","if","important","in","into","is","it","its","just","keep","kind","know","land","large","last","later","learn","leave","left","let","letter","life","light","like","line","list","little","live","long","look","made","make","man","many","may","me","mean","men","might","mile","miss","more","most","mother","mountain","move","much","must","my","name","near","need","never","new","next","night","no","not","now","number","of","off","often","oil","old","on","once","one","only","open","or","other","our","out","over","own","page","paper","part","people","picture","place","plant","play","point","put","question","quick","quickly","quite","read","really","right","river","run","said","same","saw","say","school","sea","second","see","seem","sentence","set","she","should","show","side","small","so","some","something","sometimes","song","soon","sound","spell","start","state","still","stop","story","study","such","take","talk","tell","than","that","the","their","them","then","there","these","they","thing","think","this","those","thought","three","through","time","to","together","too","took","tree","try","turn","two","under","until","up","us","use","very","walk","want","was","watch","water","way","we","well","went","were","what","when","where","which","while","white","who","why","will","with","without","word","work","world","would","write","year","you","young","your"};

    public static void main(String[] args) throws InterruptedException {
        while (true) {

            System.out.print("\r[" + ANSI_RED + " =   " + ANSI_RESET + "] 3");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "  =  " + ANSI_RESET + "] 3");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "   = " + ANSI_RESET + "] 3");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + " =   " + ANSI_RESET + "] 2");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "  =  " + ANSI_RESET + "] 2");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "   = " + ANSI_RESET + "] 2");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + " =   " + ANSI_RESET + "] 1");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "  =  " + ANSI_RESET + "] 1");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_RED + "   = " + ANSI_RESET + "] 1");
            Thread.sleep(500);

            System.out.print("\r[" + ANSI_BLUE + " GO!! " + ANSI_RESET + "] ");
            Thread.sleep(500);

            System.out.println(" ");

            String wds = "";

            Random random = new Random();
            for(int i=0; i<20; i++) {
            wds+=word[random.nextInt(200)]+" ";
            }

            wds.trim();
            System.out.print(wds + "");
            System.out.println(" ");

            long start = System.currentTimeMillis();

            Scanner scan = new Scanner(System.in);
            String my = scan.nextLine();
            long stop = System.currentTimeMillis();

            if(wds.equals(my)) {
                long finish = stop - start;
                long read = finish / 1000;
                System.out.println("well done" + "\nyour score is " + ANSI_BLUE + read + ANSI_RESET);
            }else {
                System.out.println("you had a few errors!");
            }

            Scanner next = new Scanner(System.in);
            System.out.println("you do want to" + ANSI_RED + " stop " + ANSI_RESET + "or" + ANSI_BLUE + " restart " + ANSI_RESET + "the test");
            String wht = next.next();

            if (wht.equals("stop")) {
                System.out.println("you have completed your test");
                System.out.println("program terminated");
                break;
            }else if (wht.equals("restart")) {
                System.out.println("restarting your test!");
            }else {
                System.out.println("invalid entry, try again");
                System.out.println("you do want to" + ANSI_RED + " stop " + ANSI_RESET + "or" + ANSI_BLUE + " restart " + ANSI_RESET + "the test");
                String wht2 = next.next();
                if (wht2.equals("stop")) {
                System.out.println("you have completed your test");
                System.out.println("program terminated");
                break;
                }else if (wht2.equals("restart")) {
                    System.out.println("restarting your test!");
                }
            }

        }

    }
}



