package by.bsu2.java8.lambda.stream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilesMain {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("text", "students.txt");
        Stream<String> stream = null;
        try {
            stream = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    //    List<String> list = stream.collect(Collectors.toList());
    //    System.out.println(list);
        stream.forEach(System.out::println);
    }
}
