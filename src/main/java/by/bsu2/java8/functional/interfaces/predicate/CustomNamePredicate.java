package by.bsu2.java8.functional.interfaces.predicate;

import java.util.function.Predicate;

/**
 * Created by Ihar_Blinou on 6/24/2015.
 */
  public class CustomNamePredicate implements Predicate<String> {
    @Override
    public boolean test(String ob) {
        return ob.contains("o");
    }
}
