package by.bsu2.streams;



import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class TestStreams {
    public static void main(String[] args) throws CustomException {
        // у нас есть список студентов в файле
        // и мы хотим перобразоваться его в реальные объекты студентов

        // List names, элементами которого явл-ся строки с данными о студентах,
        // вычитанные из файла
        List<String> names = FileHandler.linesList("text/students.txt");
        // создаём для них поток
        Stream<String> namesStream = names.stream();

        //сортируем фамилии в потоке в лексикографическом порядке
        // в качестве компаратора передаём ссылку на метод String.compareToIgnoreCase
        Comparator<Student> studCompInitial = (stud1,stud2)->{
            return stud1.getSurname().compareToIgnoreCase(stud2.getSurname());
        };

        // если попадаются два студента с одинаковыми фамилиями
        // сортируем их по имени
        Comparator<Student> studentCompFinal = studCompInitial.thenComparing((stud1,stud2)->{
            return stud1.getName().compareToIgnoreCase(stud2.getName());
        });

        // преобразуем поток строк с данными о студентах
        // в поток объектов класса Student
        Stream<Student> studentsStream = namesStream.map(nameString -> {
            String[] fio = nameString.split(" ");
            String surname = fio[0].trim();
            String name = fio[1].trim();
            int id = IdGenerator.generateId();
            return new Student(id, surname, name);
        });

        //тоже самое без использования лямбда-выражений
        /*Stream<Student> studentsStream = sortedNamesStream.map(new Function<String, Student>() {
            @Override
            public Student apply(String nameString) {
                String[] fio = nameString.split(" ");
                String surname = fio[0].trim();
                String name = fio[1].trim();
                int id = IdGenerator.generateId();
                return new Student(id, surname, name);
            }
        });*/

        Stream<Student> sortedStudentStream = studentsStream. sorted(studentCompFinal);

        // преобразуем поток студентов в коллекцию
        List<Student> students = sortedStudentStream.collect(Collectors.toList());

        //предположим мы хотим разделить студентов группы
        // на две подгруппы groupA и groupB

        // предполагаем, что groupNumber и groupCourse получены из какого-то источника
        int groupId = IdGenerator.generateId();
        int groupNumber = 2;
        int groupCourse = 4;

        // создаём группу для студентов
        Group group = new Group(groupId, groupNumber, groupCourse);


        students.forEach(student -> {
            if(students.indexOf(student) < (students.size() / 2)){
                group.addToAGroup(student);
            }
            else{
                group.addToBGroup(student);
            }
        });

        // или тоже самое не использую лямбда-выражения
        /*students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                if(students.indexOf(student) < (students.size() / 2)){
                    group.addToAGroup(student);
                }
                else{
                    group.addToBGroup(student);
                }
            }
        });*/

        // Вывод группы со студентами
        System.out.println(group);
    }
}
