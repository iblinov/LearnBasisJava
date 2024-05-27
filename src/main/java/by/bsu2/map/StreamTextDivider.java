package by.bsu2.map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTextDivider {
    public Map<String, Long> divideTextFromFile(String filePath){
        String punctRegex = "\\p{Punct}";
        String spaceRegex = "\\s+";
        Map<String, Long> wordMap = new HashMap<>();
        try {
            wordMap = Files.lines(Paths.get(filePath))
                    .map(line -> line.replaceAll(punctRegex, " ").toUpperCase())
                    .map(line -> line.split(spaceRegex))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordMap;
    }
}