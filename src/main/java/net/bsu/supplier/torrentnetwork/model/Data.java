package net.bsu.supplier.torrentnetwork.model;

public class Data {

	private final int part;

	public Data(int part) {
		this.part = part;
	}

	public int getPart() {
		return part;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Data data = (Data) o;

		if (part != data.part) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return part;
	}

	@Override
	public String toString() {
		return String.valueOf(part);
	}
}
