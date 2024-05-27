package by.bsu2.weakhash.entity;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	private static final Random rand = new Random();
	
	public static void main(String[] args)  {
		CurrentOrders weak = new CurrentOrders();
		Set<Key> keys = new HashSet<>();
		// 1
		for (int i=0; i< 10; i++){
			Key key = BeanGenerator.keyGen();
			weak.put(key, BeanGenerator.orderGen());
		}
		System.out.println("after 10 adding, without save to list");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
		// 2
		for (int i=0; i< 10_000; i++){
			Key key = BeanGenerator.keyGen();
			weak.put(key, BeanGenerator.orderGen());
			keys.add(key);
		}
		System.out.println("after 10 000 adding, with save to list");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
		Random rand = new Random();

		keys = keys.stream().map(o->o.changeKey(rand.nextBoolean())).filter(o->!o.isProcessed()).collect(Collectors.toSet());

		System.out.println("after removing");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
		System.gc();
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after sleep");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
		// 3
		for (int i=0; i< 20000; i++){
			weak.put(BeanGenerator.keyGen(), BeanGenerator.orderGen());
			//keys.add(key);
		}
		System.out.println("RIGHT after 20000 adding, without save to list");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
		System.gc();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sleep; after 20000 adding, without save to list");
		System.out.println("weak "+weak.size());
		System.out.println("keys "+keys.size());
	}	
}
