package com.arijit.designpattern.structural.adapter;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		ChargingPointWire chargingPointWire = new _4mmCorePinChargingPointWire();
		
		ChargerSocketWire adapter = new LaptopChargerAdapter(chargingPointWire);
		adapter.type();
	}

}
