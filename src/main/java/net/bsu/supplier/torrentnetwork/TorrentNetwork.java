package net.bsu.supplier.torrentnetwork;


import net.bsu.supplier.torrentnetwork.model.Data;
import net.bsu.supplier.torrentnetwork.model.Seed;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

public class TorrentNetwork extends Thread {

	private static final Logger LOGGER = Logger.getLogger(TorrentNetwork.class.getSimpleName());

	private final List<Seed> seeds;
	private final List<Data> downloadedData;
	private int partCount;

	public TorrentNetwork() {
		seeds = new ArrayList<>();
		downloadedData = new CopyOnWriteArrayList<>();
	}

	public void addSeed(Seed seed) {
		seeds.add(seed);
		seed.start();
	}

	@Override
	public void run() {
		while (downloadedData.size() < partCount) {
			// extract next part of data
			Data data;
			do {
				data = next();
			} while (downloadedData.contains(data));

			if (data == null) {
				continue;
			}

			downloadedData.add(data);
			LOGGER.info("retrieved " + data.getPart() + " part");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LOGGER.warning(e.getMessage());
			}
		}

		LOGGER.info("file successfully downloaded: " + downloadedData);
	}

	private Data next() {
		// randomly select seed
		for (Seed seed : seeds) {
			if (Math.random() < 0.1) {
				return seed.get();
			}
		}
		return null;
	}

	public void downloadFile(int partCount) {
		this.partCount = partCount;
		start();
	}

}
