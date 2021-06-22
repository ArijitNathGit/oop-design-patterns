package com.arijit.designpattern.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("16GB", "Intel", "500GB", "PC");
		Computer server = ComputerFactory.getComputer("64GB", "Intel", "5TB", "Server");
		
		System.out.println(pc);
		System.out.println(server);
	}
	
}

class ComputerFactory {
	public static Computer getComputer(String RAM, String CPU, String HDD, String type) {
		switch(type) {
			default:
			case "PC":
				return new PC(RAM, CPU, HDD);
			case "Server":
				return new Server(RAM, CPU, HDD);				
		}
	}
}

interface Computer {
	String getRAM();
	String getCPU();
	String getHDD();
}

class PC implements Computer {
	
	private String ram;
	private String cpu;
	private String hdd;

	public PC(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;		
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}
	
}

class Server implements Computer {
	
	private String ram;
	private String cpu;
	private String hdd;
	
	public Server(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;		
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}
	
	@Override
	public String toString() {
		return "Server [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}
	
}