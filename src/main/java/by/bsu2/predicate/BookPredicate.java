package by.bsu2.predicate;

import by.bsu2.predicate.entities.Book;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookPredicate {

    public static Predicate<Book> isNewBook(int year) {
        return book -> book.getYear() == year;
    }

    public static Predicate<Book> isThickBook(int countPage) {
        return book -> book.getCountPage() > countPage;
    }

    public static List<Book> filterBooks(List<Book> books, Predicate<Book> predicate) {
        return books.stream().filter(predicate).collect(Collectors.<Book>toList());
    }
}
