package net.bsu.supplier.torrentnetwork.runner;

import net.bsu.supplier.torrentnetwork.TorrentNetwork;
import net.bsu.supplier.torrentnetwork.model.Seed;

public class TorrentNetworkRunner {

	public static void main(String[] args) {
		int partCount = 10;
		TorrentNetwork torrentNetwork = new TorrentNetwork();
		for (int i = 0; i < 100; i++) {
			Seed seed = new Seed("1.1.1." + i, partCount);
			torrentNetwork.addSeed(seed);
		}

		torrentNetwork.downloadFile(partCount);
	}

}
