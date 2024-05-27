package net.bsu.supplier.elecricitystation.model;

import java.util.function.Supplier;
import java.util.logging.Logger;

public class Building extends Thread {

	private static final Logger LOGGER = Logger.getLogger(Building.class.getSimpleName());
	private Supplier<Electricity> electricitySupplier;

	public Building(Supplier<Electricity> electricitySupplier) {
		this.electricitySupplier = electricitySupplier;
	}

	@Override
	public void run() {
		while (true) {
			Electricity electricity = electricitySupplier.get();
			LOGGER.info("retrieved " + electricity.getUnits() + " units");

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				LOGGER.warning(e.getMessage());
			}
		}
	}

	public void enableElectricity() {
		start();
	}

}
