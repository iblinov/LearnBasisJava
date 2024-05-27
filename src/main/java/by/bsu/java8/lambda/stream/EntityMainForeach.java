package by.bsu.java8.lambda.stream;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Ihar_Blinou on 7/8/2014.
 */
public class EntityMainForeach {
    public static void main(String[] args) {
        ArrayList<Entity> list = new ArrayList<Entity>(){
            {
                this.add(new Entity(35, 700, "Brick"));
                this.add(new Entity(71, 400, "Stone"));
                this.add(new Entity(51, 930, "Wagon"));
                this.add(new Entity(58, 930, "Temple"));
                this.add(new Entity(92, 400, "Castle"));
                this.add(new Entity(12, 930, "Unit"));
                this.add(new Entity(27, 520, "Tower"));
            }
        };
        Comparator<Entity> comparator = ((o1, o2) -> (int)(o2.getWeight()-o1.getWeight()));
        list.sort(comparator.thenComparing(Entity::getName));
        System.out.println(list);
       // list.sort(Entity::getWeight);
        
    }
}
