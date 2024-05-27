package by.streamprj.runner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Base64;
import java.util.Locale;

public class Runner {
    private static Logger logger  = LogManager.getLogger();
    private static Logger logger2  = LogManager.getLogger(Runner.class);
    private static Logger logger3  = LogManager.getLogger("Runner");
    public static void main(String[ ] args) {
        logger.info("first log!!!");

        try{
            FileReader wr = new FileReader("text1.txt");
         //   wr.read();
        } catch(IOException e) {
            logger.log(Level.ERROR, e);
            System.out.println("-------------");
            logger.catching(e);
        }
        String str = "Pass_1";
        Base64.Encoder be = Base64.getEncoder();
        byte[] bytesEncoded = be.encode(str.getBytes());
        System.out.println("ecncoded value is " + new String(bytesEncoded ));
        BigInteger bigInt = new BigInteger(1, bytesEncoded);
        String resHex = bigInt.toString(16);
        System.out.println(resHex);
        Locale current = new Locale("be", "by");
        System.out.println(current.getDisplayScript(Locale.CANADA));
        System.out.println(current);

// Decode data on other side, by processing encoded data
//        byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
//        System.out.println("Decoded value is " + new String(valueDecoded));
//        ArrayList<Order> orders = new ArrayList<Order>() {
//            {
//                add(new Order(231, 12.f));
//                add(new Order(389, 2.9f));
//                add(new Order(217, 1.7f));
//            }
//        };
//        FindOrder fo = new FindOrder();
//        List<Order> res = fo.findBiggerAmountOrder(10f, orders);
//        System.out.println(res);
    }
}



















