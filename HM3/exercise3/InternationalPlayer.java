package domain.hcl.homeworks.HM3.exercise3;

public class InternationalPlayer extends Player{
	private String capNumber;
	private Long noOfTestAppearence, noOfODIAppearence;
	
	InternationalPlayer(){
		
	}
	
	public String getCapNumber() {
		return capNumber;
	}

	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}

	public Long getNoOfTestAppearence() {
		return noOfTestAppearence;
	}

	public void setNoOfTestAppearence(Long noOfTestAppearence) {
		this.noOfTestAppearence = noOfTestAppearence;
	}

	public Long getNoOfODIAppearence() {
		return noOfODIAppearence;
	}

	public void setNoOfODIAppearence(Long noOfODIAppearence) {
		this.noOfODIAppearence = noOfODIAppearence;
	}

	@Override
	public void displayDetails() {
		System.out.println(
		"Player Details: "+"\n"+
		"Player name: "+name+"\n"+
		"Player country: "+country+"\n"+
		"Cap Number: "+capNumber+"\n"+
		"Number of test appearance: "+noOfTestAppearence+"\n"+
		"Number of ODI appearance: "+noOfODIAppearence
				);
	}

}
