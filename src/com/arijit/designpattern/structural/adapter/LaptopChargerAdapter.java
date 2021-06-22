package com.arijit.designpattern.structural.adapter;

public class LaptopChargerAdapter implements ChargerSocketWire {

	private ChargingPointWire chargingPointWire;
	
	public LaptopChargerAdapter(ChargingPointWire chargingPointWire) {
		this.chargingPointWire = chargingPointWire;
	}
	
	@Override
	public void type() {
		chargingPointWire.chargingPoint();
	}
	
}
