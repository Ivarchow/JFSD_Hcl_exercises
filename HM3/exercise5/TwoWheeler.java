package domain.hcl.homeworks.HM3.exercise5;


public class TwoWheeler extends Vehicle {
	
	private Boolean kickStartAvailable;
	
	public TwoWheeler(){
		super("Suzuki","TN60Z1234","1. Petrol"+"\n"+"2. Diesel",15,150);
		setKickStartAvailable(kickStartAvailable);
	}

	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo() {
		System.out.println("---Detail Information---"+"\n"+
				"Kick Start Available: "+kickStartAvailable);	
		}
	
	
}
