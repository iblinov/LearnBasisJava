package net.bsu.supplier.elecricitystation;

import net.bsu.supplier.elecricitystation.model.Electricity;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class ElectricPowerStation extends Thread implements Supplier<Electricity> {

	private static final Logger LOGGER = Logger.getLogger(ElectricPowerStation.class.getSimpleName());
	private final BlockingQueue<Electricity> queue;
	private final Random random;

	public ElectricPowerStation() {
		queue = new LinkedBlockingQueue<>();
		random = new Random();
		start();
	}

	@Override
	public Electricity get() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			throw new IllegalStateException("not enough electricity");
		}
	}

	@Override
	public void run() {
		while (true) {
			Electricity electricity = new Electricity();
			electricity.setUnits(random.nextInt(100));

			try {
				queue.put(electricity);

				Thread.sleep(5000);
			} catch (InterruptedException e) {
				LOGGER.warning(e.getMessage());
			}
		}
	}

}
