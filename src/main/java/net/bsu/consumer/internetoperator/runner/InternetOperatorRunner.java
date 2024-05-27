package net.bsu.consumer.internetoperator.runner;

import net.bsu.consumer.internetoperator.InternetOperatorClient;
import net.bsu.consumer.internetoperator.model.Service;
class GlobalInit {
	final static Integer COUNTER;
	static {
		COUNTER = Integer.parseInt("a");
	}
}

public class InternetOperatorRunner {

	public static void main(String[] args) {


		Service freeVideos = new Service("15GB Free Videos");
		InternetOperatorClient client = new InternetOperatorClient(1);
		client.accept(freeVideos);

		System.out.println(client.getCurrentServices());
	}

}
