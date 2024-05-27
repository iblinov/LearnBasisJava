package net.bsu.consumer.internetoperator;

import net.bsu.consumer.internetoperator.model.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InternetOperatorClient implements Consumer<Service> {

	private final int clientId;
	private final List<Service> clientServices;

	public InternetOperatorClient(int clientId) {
		this.clientId = clientId;
		clientServices = new ArrayList<>();
	}

	@Override
	public void accept(Service service) {
		clientServices.add(service);
	}

	public List<Service> getCurrentServices() {
		return clientServices;
	}
}
