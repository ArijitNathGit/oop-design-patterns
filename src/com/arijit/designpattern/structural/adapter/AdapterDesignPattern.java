package com.arijit.designpattern.structural.adapter;

/**
 * Advantages:

 * Helps achieve reusability and flexibility.
 * Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.
 * 
 * Disadvantages:
 *
 * All requests are forwarded, so there is a slight increase in the overhead.
 * Sometimes many adaptations are required along an adapter chain to reach the type which is required.
 * 
 * */
public class AdapterDesignPattern {

	public static void main(String[] args) {
		ChargingPointWire chargingPointWire = new _4mmCorePinChargingPointWire();
		
		ChargerSocketWire adapter = new LaptopChargerAdapter(chargingPointWire);
		adapter.type();
	}

}
