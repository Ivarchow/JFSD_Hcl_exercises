package domain.hcl.homeworks.HM3.exercise5;

public class FourWheeler extends Vehicle {
	
	private String audioSystem;
	private Integer numberOfDoors;
	
	FourWheeler(){
		super("Volvo", "TN01BR96689", "1. Petrol"+"\n"+"2. Diesel", 40, 1960);
		
	}
	
	
	public String getAudioSystem() {
		return audioSystem;
	}


	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}


	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public void displayDetailInfo() {
		System.out.println("---Detail Information---"+"\n"+
				"Audio System: "+audioSystem+"\n"+
				"Number of Doors: "+numberOfDoors);
	}

}
