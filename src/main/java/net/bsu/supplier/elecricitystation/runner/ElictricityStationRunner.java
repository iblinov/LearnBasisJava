package net.bsu.supplier.elecricitystation.runner;

import net.bsu.supplier.elecricitystation.model.Building;
import net.bsu.supplier.elecricitystation.ElectricPowerStation;
import net.bsu.supplier.elecricitystation.model.Electricity;

import java.util.function.Supplier;

public class ElictricityStationRunner {

	public static void main(String[] args) {
		Supplier<Electricity> electricitySupplier = new ElectricPowerStation();

		Building building = new Building(electricitySupplier);
		building.enableElectricity();
	}

}
