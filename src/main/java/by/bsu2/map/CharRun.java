package by.bsu2.map;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharRun {
    public static void main(String[] args) throws IOException {
        String text = "Some example".toLowerCase().replaceAll("\\s", "");
        List<Character> textInChar = text.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        Map<Character, Integer> countChar = textInChar.stream().collect(HashMap::new,
                (m, c) -> m.merge(c, 1, Integer::sum),
                HashMap::putAll);
        System.out.println(countChar);


        Path path = FileSystems.getDefault().getPath("data\\text.txt");
        List<String> list = new ArrayList<String>();
        try {
            Files.lines(path).filter(s->!s.isEmpty()).forEach(list::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> strings= list
                .stream()
                .collect(ArrayList::new, (lst, str) ->
                        lst.addAll(Arrays.asList(str.replaceAll("\\p{Punct}", "").trim().split("\\s+")))
                , ArrayList::addAll);
        System.out.println(strings);

//        List<String> strings= list
//                .stream()
//                .collect(ArrayList::new, (lst, str) -> lst.addAll(Arrays.asList(str.split("(\\p{Punct}*)\\s+"))), ArrayList::addAll);
//
//        System.out.println(strings);
//        List<String> listRes = new ArrayList<String>();
//        strings.stream().filter(s-> !s.isEmpty()).map(s->s.replaceAll("\\p{Punct}","")).forEach(listRes::add);

        Map<String, Integer> countStr = strings.stream().collect(HashMap::new, (map, str) ->
                map.merge( str.toLowerCase(), 1, Integer::sum )
        , HashMap::putAll);
        System.out.println(countStr);
    }
    public void m(){
        // Character::valueOf принимает char, а поток у нас из int
        String output = "Some example".chars().mapToObj( ch -> new Character( (char)ch ) )
                // сгруппировать по символам, внутри группы подсчитать количество
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
                // группировка возвращает Map<Character, Integer> с количеством разных символов
                .entrySet().stream()
                // если надо выбрать только встречающиеся 1 раз
                //.filter( entry -> entry.getValue() == 1 )
                // раз forEach плохо :)
                //.forEach( entry -> System.out.printf( "'%s' -> %d%n", entry.getKey(), entry.getValue() ) );
                .map( entry -> String.format( "'%s' -> %d%n", entry.getKey(), entry.getValue() ) )
                .collect( Collectors.joining() );

        System.out.println( output );
    }
}
