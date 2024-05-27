package by.bsu.java8.functional.interfaces;
import java.util.Comparator;
public class ComparatorMain {

	public static void main(String[] args) {
		Comparator<Entity> comparator = (e1, e2) -> e1.getId() - e2.getId();
		Entity e1 = new Entity(23, "Bender");
		Entity e2 = new Entity(53, "Balaganov");
		System.out.println(comparator.compare(e1, e2));
		//System.out.println((e1, e2) -> e1.getId() - e2.getId());
		System.out.println(comparator.reversed().compare(e1, e2));
		System.out.println(comparator.thenComparing((o1,o2)->o1.getName().compareTo(o2.getName())));
	}
}
