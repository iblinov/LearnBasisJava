package by.bsu2.java8.lambda.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        Comparator<Entity> comparator = (o1, o2) ->  o1.getEntityId() - o2.getEntityId();
        ArrayList<Entity> list = new ArrayList<>();
        int a = 1;
        list.sort((o1, o2) ->  o1.getEntityId() - o2.getEntityId() + a);//a++
      //   a = 2;
        Comparator.comparing(Entity::getEntityId).reversed().thenComparing(Entity::getWeight).reversed();
    }
}
