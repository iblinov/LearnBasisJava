package by.bsu2.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class PathStreamRunner {
    public static void main(String[] args) {
        String dirName = "text";
        String filename = "students.txt";
     //   Files.find()
        Path path = FileSystems.getDefault().getPath(dirName, filename);
        Stream<String> stringStream = null;
        try {
            stringStream = Files.lines(path);
            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (stringStream != null) {
            //  stringStream.forEach(System.out::println);

            ArrayList<String> strings = new ArrayList<>();
            //  stringStream.forEach(_tmp -> strings.add(_tmp));
            stringStream.forEach(strings::add);
            System.out.println(String.join(" ", strings));
        } else {
            System.out.println("Stream does not build");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("text\\students.txt"))) {
            ArrayList<String> strings = new ArrayList<>();
            reader.lines().map(String::trim).filter(str -> !str.isEmpty()).sorted().forEach(strings::add);
            strings.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
