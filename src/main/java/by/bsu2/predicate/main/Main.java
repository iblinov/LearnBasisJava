package by.bsu2.predicate.main;

import by.bsu2.predicate.BookPredicate;
import by.bsu2.predicate.entities.Book;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J. K. Rowling", 2008, 998));
        books.add(new Book("Anathem", "Neal Stephenson", 2010, 287));
        books.add(new Book("Matter", "Iain M. Banks", 2014, 412));
        books.add(new Book("The Prefect", "Alastair Reynolds", 2005, 284));
        books.add(new Book("Fallen Dragon", "Peter F. Hamilton", 2006, 1345));
        books.add(new Book("Line War", "J. K. Rowling", 2014, 1195));
        books.add(new Book("Harry Potter", "Neal Asher", 2012, 442));

        System.out.println("New books: " + BookPredicate.filterBooks(books, BookPredicate.isNewBook(2014)));
        System.out.println("Thick books" + BookPredicate.filterBooks(books, BookPredicate.isThickBook(896)));

    }
}
