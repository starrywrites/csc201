//@author Peyton Starr
//@unit Module 4
//@assignment Programming Problems
//@problem PROBLEM 4 - ELECTRONIC EQUIPMENT

package csc201mod4;

public class Mod4Problem4 {

	public static void main(String[] args) {
		// Create reading material objects
		Computer myComp = new Computer("Intel i5", "Windows 10", 15.5, "Dell", 8.7, 1.8);
		Smartphone mySmart = new Smartphone("AT&T", "ARM Cortex-A8", "Apple iOS", 6.6, "Apple", 0.98, 1.55);
		Pager myPager = new Pager(160, true, "Old Tech Inc.", 0.35, 0.5);
		DigitalCamera myCam = new DigitalCamera(false, false, 5184, 3888, "Nikon", 0.6, 0.89);

		// Print reading material objects
		System.out.println(myComp.toString());
		System.out.println(mySmart.toString());
		System.out.println(myPager.toString());
		System.out.println(myCam.toString());
	}
}

class Electronic {
	// Define variables
	private String electronicType;
	private String manufacturer;
	private double weight;
	private double powerUse;

	// Define default constructor
	Electronic() {
	}
	
	// Define constructor
	Electronic(String electronicType, String manufacturer, double weight, double powerUse) {
		this.electronicType = electronicType;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.powerUse = powerUse;
	}

	// Set electronic type
	public void setElectronicType(String electronicType) {
		this.electronicType = electronicType;
	}
	
	// Set manufacturer
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	// Set weight of item
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// Set power use in watts
	public void setPowerUse(double powerUse) {
		this.powerUse = powerUse;
	}
	
	// Return a string representation of this object
	public String toString() {
		return "----------\n\nElectronic Type: " + electronicType + "\nManufacturer: " + manufacturer + 
				"\nWeight: " + weight + "lbs" + "\nPower: " + powerUse + "W";
	}
}


class Computer extends Electronic {
	// Define variables
	private String processor;
	private String os;
	private double screenSize;
	
	// Define default constructor
	public Computer() {
		setElectronicType("Computer");
	}
	
	// Define constructor with this class's parms
	public Computer(String processor, String os, double screenSize) {
		this.processor = processor;
		this.os = os;
		this.screenSize = screenSize;
		setElectronicType("Computer");
	}

	// Define constructor with all parms
	public Computer(String processor, String os, double screenSize, String manufacturer, double weight, double powerUse) {
		this.processor = processor;
		this.os = os;
		this.screenSize = screenSize;
		setElectronicType("Computer");		
		setManufacturer(manufacturer);
		setWeight(weight);
		setPowerUse(powerUse);
	}
	
	// Set processor type and version
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	// Set Operating System
	public void setOS(String os) {
		this.os = os;
	}
	
	// Set size of the screen in inches
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nProcessor: " + processor + "\nOperating System: " + os + "\nScreen Size: " + screenSize + "in";
	}	
}


class Smartphone extends Computer {
	// Define variables
	private String serviceProvider;
	
	// Define default constructor
	public Smartphone() {
		setElectronicType("Smartphone");
	}
	
	// Define constructor with this class's parms
	public Smartphone(String serviceProvider) {
		this.serviceProvider = serviceProvider;
		setElectronicType("Smartphone");
	}
	
	// Define constructor with all parms
	public Smartphone(String serviceProvider, String processor, String os, double screenSize, String manufacturer, double weight, double powerUse) {
		this.serviceProvider = serviceProvider;
		setProcessor(processor);
		setOS(os);
		setScreenSize(screenSize);
		setElectronicType("Computer");		
		setManufacturer(manufacturer);
		setWeight(weight);
		setPowerUse(powerUse);
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nService Provider: " + serviceProvider;
	}	
}


class Pager extends Electronic {
	// Define variables
	private int maxScreenChars;
	private boolean hasBuzzer;
	
	// Define default constructor
	public Pager() {
		setElectronicType("Pager");
	}
	
	// Define constructor with this class's parms
	public Pager(int maxScreenChars, boolean hasBuzzer) {
		this.maxScreenChars = maxScreenChars;
		this.hasBuzzer = hasBuzzer;
		setElectronicType("Pager");
	}

	// Define constructor with all parms
	public Pager(int maxScreenChars, boolean hasBuzzer, String manufacturer, double weight, double powerUse) {
		this.maxScreenChars = maxScreenChars;
		this.hasBuzzer = hasBuzzer;
		setElectronicType("Pager");	
		setManufacturer(manufacturer);
		setWeight(weight);
		setPowerUse(powerUse);
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nNumber of characters that can fit on screen: " + maxScreenChars + "\nCan vibrate?: " + hasBuzzer;
	}		
	
}

class DigitalCamera extends Electronic {
	// Define variables
	private boolean isDSLR;
	private boolean isWaterproof;
	private int resW;
	private int resH;
	
	// Define default constructor
	public DigitalCamera() {
		setElectronicType("Digital Camera");
	}
	
	// Define constructor with this class's parms
	public DigitalCamera(boolean isDSLR, boolean isWaterproof, int resW, int resH) {
		this.isDSLR = isDSLR;
		this.isWaterproof = isWaterproof;
		this.resW = resW;
		this.resH = resH;
		setElectronicType("Digital Camera");
	}
	
	// Define constructor with all parms
	public DigitalCamera(boolean isDSLR, boolean isWaterproof, int resW, int resH, String manufacturer, double weight, double powerUse) {
		this.isDSLR = isDSLR;
		this.isWaterproof = isWaterproof;
		this.resW = resW;
		this.resH = resH;
		setElectronicType("Digital Camera");
		setManufacturer(manufacturer);
		setWeight(weight);
		setPowerUse(powerUse);
	}		
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nIs DSLR?): " + isDSLR + "\nIs waterproof?: " + isWaterproof + "\nPhoto Resolution: " + resW + " x " + resH;
	}	
}