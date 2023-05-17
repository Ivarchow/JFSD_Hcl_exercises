package domain.hcl.homeworks.HM3.exercise3;

public class Player {
	protected String name;
	protected String country;
	
	Player(){
	}
	
	public void displayDetails() {
		System.out.println(
				"Player name: "+name+
				"Player country: "+country);
	}

}
