package net.bsu.consumer.animal.runner;

import net.bsu.consumer.animal.model.Animal;
import net.bsu.consumer.animal.model.Food;

public class Runner {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Food food = new Food();
		food.setWeight(500);

		animal.accept(food);
		animal.goToToilet();
	}

}
