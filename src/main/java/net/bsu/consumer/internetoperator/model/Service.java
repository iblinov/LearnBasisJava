package net.bsu.consumer.internetoperator.model;

public class Service {

	private final String title;

	public Service(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Service{" +
			"title='" + title + '\'' +
			'}';
	}
}
