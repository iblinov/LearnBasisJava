package net.bsu.supplier.torrentnetwork.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class Seed extends Thread implements Supplier<Data> {

	private final String ip;
	private final BlockingQueue<Data> queue;

	public Seed(String ip, int partCount) {
		this.ip = ip;
		queue = new LinkedBlockingQueue<>();

		// generate data
		List<Data> dataList = new ArrayList<>();
		for (int i = 0; i < partCount; i++) {
			Data data = new Data(i);
			dataList.add(data);
		}

		Collections.shuffle(dataList);
		queue.addAll(dataList);
	}

	public String getIp() {
		return ip;
	}

	@Override
	public Data get() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			throw new IllegalStateException("not enough data");
		}
	}
}
