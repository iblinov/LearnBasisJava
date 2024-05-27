package by.bsu2.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Denis on 20.06.2017.
 */
public class IterableClass implements Iterable<String> {

    private List<String> strings = new ArrayList<>();

    public void add(String value) {
        strings.add(value);
    }

    @Override
    public Iterator iterator() {
        return new CustomIterator(strings);
    }

    public class CustomIterator implements Iterator {

        private int index;
        private List<String> strings = new ArrayList<>();

        public CustomIterator(List<String> strings) {
            this.strings = strings;
        }

        @Override
        public boolean hasNext() {
            return strings.size() >= index + 1;
        }

        @Override
        public String next() {
            return strings.get(index++);
        }
    }
}
