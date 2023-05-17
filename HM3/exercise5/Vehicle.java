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
		System.out.println("***"+make+"***"+"\n");
	}
	
	public void displayBasicInfo() {
		System.out.println(
				"---Basic Information---"+"\n"+
				"Vehicle Number: "+vehicleNUmber+"\n"+
				"Fuel Capacity: "+fuelCapacity+"\n"+
				"Fuel Type: "+fuelType+"\n"+
				"CC: "+cc);
	}
	
	public void displayDetailInfo() {
		
	}
	
}
