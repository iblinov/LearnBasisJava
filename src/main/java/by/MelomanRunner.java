package by;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MelomanRunner {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        MusicStyle style = MusicStyle.CLASSIC; // инициализация
        logger.log(Level.INFO, "is" +style);
       // System.out.print(style);
        switch (style) {
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            case CLASSIC:
                System.out.println(" is Classic");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            default:
                System.out.println(" Unknown music style: " + style);
        }
        style.info();
    }
}
