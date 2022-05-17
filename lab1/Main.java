import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main{
    public static void main(String [] args)
    {

        new Main().run();
        return;
    }
    public void run()
    {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    }
    public String pluralize(String arg, int animal)
    {
        return arg + "s";
    }
    public void flipNHeads(int n)
    {
        Random rand = new Random();
        int flips = 0;
        int headCount = 0;
        while(headCount != n){
            float rando = rand.nextInt(10);
            rando /= 10;
            ++flips;
            if(rando < 0.5)
            {
                continue;
            }else{
                ++headCount;
            }
            System.out.println("took: " + flips + "flips to flip " + n + "heads in a row.");
        }
    }
    public static void clock()
    {
        String tempTime = "";
        while(true){
            LocalDateTime present = LocalDateTime.now();
            DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss:");
            String formatDateTime = present.format(formattedTime);
            if(!formatDateTime.equals(tempTime)){
                System.out.println(formatDateTime);
            }
            tempTime = formatDateTime;
        }

    }
}