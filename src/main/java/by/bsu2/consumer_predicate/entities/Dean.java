package by.bsu2.consumer_predicate.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Yauheniya_Neliub on 11/28/2014.
 */
public class Dean {
    private List<Student> listExpelledStudent;

    public Dean() {
        listExpelledStudent = new ArrayList<Student>();
    }

    public List<Student> getListExpelledStudent() {
        return listExpelledStudent;
    }

    public void expelled(Student student, Predicate<Student> predicate, Consumer<Student> consumer) {
        if (predicate.test(student)) {
            consumer.accept(student);
            listExpelledStudent.add(student);
        }
    }
}
