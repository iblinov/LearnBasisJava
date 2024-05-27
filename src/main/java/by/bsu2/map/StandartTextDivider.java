package by.bsu2.map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandartTextDivider {

    public Map<String, Integer> divideTextFromFile(String filePath){
        HashMap<String, Integer> wordMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                String[] wordsInLine = currentLine.split("\\s+");
                addWordsToMap(wordsInLine, wordMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordMap;
    }

    private void addWordsToMap(String[] words, Map<String, Integer> wordMap){
        for (String str : words) {
            int count = 1;
            if (wordMap.containsKey(str)){
                count += wordMap.get(str);
            }
            wordMap.put(str, count);
        }
//        List<String> list = Arrays.asList(words);
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        Map<String, Integer> wordToCount = new TreeMap<>();
//        for (String word : text.split(" "))
//        {
//            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
//        }
//        System.out.println(wordToCount);



//        for (int i = 0; i < words.length; i++) {
//            words[i] = "java";
//            int count = 1;
//            if (worldMap.containsKey(words[i])) {
//                count += worldMap.get(words[i]);
//            }
//            worldMap.put(words[i], count);
//        }


        }
    }
