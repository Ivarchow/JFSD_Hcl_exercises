package domain.hcl.homeworks.HM3.exercise5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FourWheeler  FW = new FourWheeler();
		TwoWheeler TW = new TwoWheeler();
		Scanner data = new Scanner(System.in);
		System.out.println("1. Four Wheeler"+"\n"+"2. Two Wheeler"+"\n"+"Enter the Vehicle type: ");
		String vehicleType = data.nextLine();
		Boolean kickStartword;
		
		if(vehicleType.equals("1")) {
			System.out.println(
					"Vehicle Make: "+FW.make+"\n"+
					"Vehicle Number: "+FW.vehicleNUmber+"\n"+
					"Fuel Type: "+"\n"+FW.fuelType);
			String fuelType = data.nextLine();
			
			if(fuelType.equals("1")) {
				FW.fuelType = "Petrol";
			}else {
				FW.fuelType = "Diesel";
			}
			
			System.out.println(
					"Fuel Capacity "+FW.fuelCapacity+"\n"+
					"Engine CC: "+FW.cc+"\n"+
					"Audio System: ");
			String audioSystem = data.nextLine();
			FW.setAudioSystem(audioSystem);
			
			System.out.println("Number of doors: ");
			String noOfDoors = data.nextLine();
			Integer intNoOfDoors = Integer.parseInt(noOfDoors);
			FW.setNumberOfDoors(intNoOfDoors);
		
			FW.displayMake();
			FW.displayBasicInfo();
			FW.displayDetailInfo();
		}else{
			System.out.println(
					"Vehicle Make: "+TW.make+"\n"+
					"Vehicle Number: "+TW.vehicleNUmber+"\n"+
					"Fuel Type: "+"\n"+TW.fuelType);
			String fuelType = data.nextLine();
			
			if(fuelType.equals("1")) {
				TW.fuelType = "Petrol";
			}else {
				TW.fuelType = "Diesel";
			}
			
			System.out.println(
					"Fuel Capacity "+TW.fuelCapacity+"\n"+
					"Engine CC: "+TW.cc+"\n"+
					"Kick Start Available(yes/no): ");
			String kickStartAvail = data.nextLine();
			if(kickStartAvail.equalsIgnoreCase("yes")) {
				kickStartword = true;
				TW.setKickStartAvailable(kickStartword);
			}else if(kickStartAvail.equalsIgnoreCase("no")) {
				kickStartword = false;
				TW.setKickStartAvailable(kickStartword);
			}
			
			TW.displayMake();
			TW.displayBasicInfo();
			TW.displayDetailInfo();
		}
		
		data.close();
		
	}
}
