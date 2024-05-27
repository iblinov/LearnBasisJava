package net.bsu.consumer.animal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class Animal implements Consumer<Food> {

	private static final Logger LOGGER = Logger.getLogger(Animal.class.getSimpleName());
	private final List<Food> consumedFood;

	public Animal() {
		consumedFood = new ArrayList<>();
	}

	@Override
	public void accept(Food food) {
		consumedFood.add(food);
		LOGGER.info("consumed " + food.getWeight() + " grams of food");
	}

	public void goToToilet() {
		consumedFood.clear();
		LOGGER.info("i want to eat");
	}

}
