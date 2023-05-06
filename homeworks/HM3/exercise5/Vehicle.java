package domain.hcl.homeworks.HM3.exercise5;

public class Vehicle {

	protected String make, vehicleNUmber, fuelType;
	protected Integer fuelCapacity,cc;
	
	public Vehicle(String make, String vehicleNUmber, String fuelType, Integer fuelCapacity, Integer cc) {
		this.make = make;
		this.vehicleNUmber = vehicleNUmber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayMake() {
		System.out.println(make);
	}
	
	public void displayBasicInfo() {
		System.out.println(make+" "+vehicleNUmber);
	}
	
	public void displayDetailInfo() {
		
	}
	
}
