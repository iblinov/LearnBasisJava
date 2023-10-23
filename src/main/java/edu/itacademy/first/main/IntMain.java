package edu.itacademy.first.main;

import edu.itacademy.first.creator.IntArrayFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class IntMain {
 static Logger logger = LogManager.getLogger();
  public static void main(String[] args) {
    logger.info("Hello World");
    logger.error("Hello");
    //int[] res = IntArrayFactory.createArray(20);
   // int[] res = IntArrayFactory.createBoundArray(20, 5 , 20);
   // System.out.println(res);
//    for (int i = 0; i < res.length; i++) {
//      System.out.println(res[i]);
//    }
 //   System.out.println(Arrays.toString(res));

  }
}
