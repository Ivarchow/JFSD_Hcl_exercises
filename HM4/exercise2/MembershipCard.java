package domain.hcl.homeworks.HM4.exercise2;

public class MembershipCard extends Card{
	private Integer rating;
	
	MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating){
		super(holderName,cardNumber,expiryDate);
		this.rating = rating;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
}
