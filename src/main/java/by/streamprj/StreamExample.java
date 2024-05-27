package by.streamprj;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    stream1();
    stream2();
    stream3();
    stream4();
    stream5();
    stream6();
    stream7();
    stream8();
    stream9();
    stream10();
    stream11();
    stream12();
    stream13();
    stream14();
  }

  //С помощью stream можно отделить пустые строки
  public static void stream1() {
    List<String> names = List.of("John", "Daneris", "", "Cersey", "Tyrion", "", "Jamie");
    names = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.toList());
    System.out.println(names);
  }

  //Также можно отделить строки по определённому признаку
  public static void stream2() {
    List<String> names = List.of("John", "Daneris", "", "Cersey", "Tyrion", "", "Jamie");
    names = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
    System.out.println(names);
  }

  //Определить есть ли в коллекции пустой элемент
  public static void stream3() {
    List<String> names = Arrays.asList("John", "Daneris", "", "Cersey", "Tyrion", null, "Jamie");
    boolean hasNull = names.stream().anyMatch(Objects::isNull);
    System.out.println(hasNull);
  }

  //С помощью stream можно произвести различные операции над числами: sum, average, min, max
  public static void stream4() {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    int sum = stream.mapToInt(Integer::intValue).sum();
    int max = stream.mapToInt(Integer::intValue).max().getAsInt();
    IntSummaryStatistics stistics=stream.mapToInt(Integer::intValue).summaryStatistics();

    System.out.println(sum);
  }

  //Можно отсортировать словарь по определённому алгоритму и сложить обратно в любую коллекцию
  public static void stream5() {
    Map<String, Integer> map = new HashMap<>();
    map.put("Tyrion", 4);
    map.put("Bran", 1);
    map.put("John", 5);
    map.put("Daneris", 1);
    Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
            collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    System.out.println(sortedMap);
  }

  //Можно раставить оценки студентам
  public static void stream6() {
    List<String> student = List.of("Buslov", "Zdanovich", "Bodanin", "Valiavaty", "Gilevsky", "Sinyak");
    Random random = new Random(0);
    Map<String, Integer> results = student.stream().collect(Collectors.toMap(key -> key, value -> random.nextInt(10)));
    System.out.println(results);
  }

  //Пример с сайта: https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
  public static void stream7() {
    Map<String, Integer> persons = new HashMap<>();
    persons.put("Daineris", 15);
    persons.put("John", 17);
    persons.put("Tyrion", 30);
    persons.put("Cersey", 35);
    persons.put("Aria", 11);
    String phrase = persons.entrySet().stream().filter(p -> p.getValue() >= 18).map(Map.Entry::getKey)
            .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
    System.out.println(phrase);
  }

  //отфильтровать значения, оставить те, что начинаются с «B»
  public static void stream8() {
    List<String> myList = Arrays.asList("Buslov", "Zdanovich", "Bodanin", "Valiavaty", "Gilevsky", "Sinyak");
    myList.stream() // получить поток
            .filter(s -> s.startsWith("B"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
  }

  //Нахождение максимального значения исключая null значения
  public static void stream9() {
    ArrayList<Integer> testValuesNull = new ArrayList<>();
    testValuesNull.add(0, null);
    testValuesNull.add(1, 1);
    testValuesNull.add(1, 2);
    testValuesNull.add(3, 70);
    testValuesNull.add(4, 50);
    Optional<Integer> maxValueNotNull = testValuesNull.stream().filter(Objects::nonNull).max(Integer::compareTo);
    System.out.println("maxValueNotNull=" + maxValueNotNull);
  }

  //найти в массиве количество всех чисел, которые больше 0
  public static void stream10(){
    long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();

    System.out.println(count);
  }

  //поиск первого элемента
  public static void stream11(){
    Stream.of("a1", "a2", "a3")
            .findFirst()
            .ifPresent(System.out::println);
  }

  //вывод промежутка между числами
  public static void stream12(){
    IntStream.range(1, 4)
            .forEach(System.out::println);
  }

  //убрать лишние символы/разделить строку по условию
  public static void stream13(){
    Stream<String> stream = Stream.of("A$B$C".split("\\$"));
    stream.forEach(System.out::println);
  }

  //вывод элементов из коллекции по условию
  public static void stream14(){
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i< 10; i++){
      list.add(i);
    }
    //Here creating a parallel stream
    Stream<Integer> stream = list.parallelStream();
    Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
    stream.count();//excveption
    System.out.print(Arrays.toString(evenNumbersArr));
  }
}
