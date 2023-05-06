package domain.hcl.homeworks.HM2.exercise3;

public class Delivery {
	public Long over;
	public Long ball;
	public Long runs;
	public String batsman;
	public String bowler;
	public String nonStriker;
	
	public void displayDeliveryDetails() {
		System.out.println(
		"Delivery Details:"+"\n"+
		"Over: "+this.over+"\n"+
		"Ball: "+this.ball+"\n"+
		"Runs: "+this.runs+"\n"+
		"Batsman: "+this.batsman+"\n"+
		"Bowler: "+this.bowler+"\n"+
		"NonStriker: "+this.nonStriker				
		);
	}
}
