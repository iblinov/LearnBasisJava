package by.threads.stock_exchange.io;

import by.threads.stock_exchange.entity.Broker;
import by.threads.stock_exchange.entity.ExchangeManager;
import by.threads.stock_exchange.entity.Share;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class ExchangeResultWriter {

    public final static int FIELD_LENGTH = 13;
    public final static int NO_SHARE_FIELD_COUNT = 2;
    final static Logger LOG = LogManager.getLogger();

    public static void write(ExchangeManager manager, String filePath) {

        if (filePath != null && !filePath.trim().isEmpty() && manager != null) {
            File outputFile = new File(filePath);
            try(FileWriter fw = new FileWriter(outputFile, true);
                PrintWriter writer = new PrintWriter(fw)) {

                List<Share> shares = manager.getExchange().getShares();
                int shareCount = shares.size();
                LocalTime time = LocalTime.now();

                //writing shares values
                writer.println("Time: " + time);
                for (Share share : shares) {
                    writer.print(share.toString() + " = " + share.getValue() +" ");
                }
                writer.println();

                //writing horizontal border
                for (int i = 0; i < (shareCount + NO_SHARE_FIELD_COUNT) * FIELD_LENGTH; i++) {
                    writer.write("-");
                }
                writer.println();

                //writing header
                writer.print(String.format("%11s |", "Broker name"));
                List<Broker> brokers = manager.getBrokers();
                for (Map.Entry<String, Integer> x : brokers.get(0).getShares().entrySet()) {
                    writer.print(String.format("%11s |",Share.valueOf(x.getKey())));
                }
                writer.print(String.format("%11s |", "Balance"));
                writer.println();

                // filling table
                for (Broker x: brokers) {
                    Map<String, Integer> brokerShares = x.getShares();
                    writer.print(String.format("%11s |", x.getBrokerName()));
                    for (Map.Entry<String, Integer>  y: brokerShares.entrySet()) {
                        writer.print(String.format("%11d |", y.getValue()));
                    }
                    writer.print(String.format("%11d |", x.determineBalance()));
                    writer.println();
                }

               //writing horizontal border
                for (int i = 0; i < (shareCount + NO_SHARE_FIELD_COUNT) * FIELD_LENGTH; i++) {
                    writer.write("-");
                }
                writer.println();

                //writing results
                writer.println();
                writer.println(manager.findWinner() + " is winner");
                writer.println(manager.findLooser() + " is looser");
                writer.println();
            } catch (IOException e){
                LOG.error(e +" Exception in file path " + filePath);
            }

        } else {
            LOG.warn("Null in manager or path, or path is empty!");
        }
    }
}
