package by.bsu2.weakhash.entity;

import java.util.Arrays;
import java.util.Random;

public class BeanGenerator {
	private static int id = 1;
	private static final Random rand = new Random();
	
	public static Key keyGen(){
		return new Key(id++);
	}
	
	public static Item itemGen(){
		
		return new Item(id, rand.nextFloat()*10, "item-"+id++);
	}
	
	public static Order orderGen(){
		return new Order(id++, Arrays.asList(itemGen(), itemGen()));
	}

}
