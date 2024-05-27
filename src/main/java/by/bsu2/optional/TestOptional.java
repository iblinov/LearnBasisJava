package by.bsu2.optional;

import javax.xml.stream.XMLStreamReader;
import java.io.BufferedReader;
import java.nio.file.Paths;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        String filename = "config.txt";
        // возврщаемое значение must be null

        Optional<String> optional = Optional.ofNullable(BuildOptionalReader.buildPath(filename));
        String result = optional.orElse("");
        System.out.println(result); //first output

        // Здесь все спокойно - возвращается безопасный Optional-объект
        Optional<String>  optionalNew = BuildOptionalReader.buildPathSafe(filename);
        String result0;
        if (optionalNew.isPresent()) { // если значения нет, возвращает false
             result0 = optionalNew.get();
            System.out.println(result0);//second output
        }
        optional.ifPresent(s -> System.out.println("Absolute path (nio): " + Paths.get(s).toAbsolutePath()));

        String result1 = optional.orElse("");

        System.out.println(result1);//third output

        Optional<BufferedReader> readerOpt = BuildOptionalReader.buildReader(filename);
        readerOpt.ifPresent(r -> r.lines().forEach(s-> System.out.println(s)));

//        optional = BuildOptionalReader.buildPathSafe(null);
//        result1 = optional.orElse("");
//        System.out.println(result1);//fourth output

        Optional<String> n = Optional.of(null);
//        System.out.println(n.orElse("str"));
 //       Optional<String> n1 = Optional.ofNullable("ffff");
      //  n1 = Optional.empty();
 //       System.out.println(n1.get());
    }
}