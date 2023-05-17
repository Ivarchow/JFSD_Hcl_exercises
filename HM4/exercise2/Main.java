package domain.hcl.homeworks.HM4.exercise2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println(
		"Select the card: "+"\n"+
		"1. PLayback Card"+"\n"+
		"2. Membership Card");
		
		String option = data.nextLine();
		
		if(option.equals("1")) {
			System.out.println("Enter the Card Details: ");
			String firstInput = data.nextLine();
			String[] words = firstInput.split("\\|");
			System.out.println("Enter the points in card: ");
			String pointsInCard = data.nextLine();
			Integer intPointsInCard =Integer.parseInt(pointsInCard);
			System.out.println("Enter Amount: ");
			String amontInput = data.nextLine();
			Double doubleAmontInput = Double.parseDouble(amontInput);
			PaybackCard paybackCard = new PaybackCard(words[0],words[1],words[2],intPointsInCard,doubleAmontInput);
			System.out.println(
			paybackCard.holderName+"'s Payback card Details: "+"\n"+
			"Card Number: "+paybackCard.cardNumber+"\n"+
			"Points Earned: "+paybackCard.getPointsEarned()+"\n"+
			"Total Amount: "+paybackCard.getTotalAmount()
					);
		}else {
			System.out.println("Enter the Card Details: ");
			String firstInput = data.nextLine();
			String[] words = firstInput.split("\\|");
			System.out.println("Enter the rating card: ");
			
			String ratingInCard = data.nextLine();
			Integer intRatingInCard =Integer.parseInt(ratingInCard);
			
			MembershipCard membershipCard = new MembershipCard(words[0],words[1],words[2],intRatingInCard);
			System.out.println(
					membershipCard.holderName+"'s membership card Details: "+"\n"+
					"Card Number: "+membershipCard.cardNumber+"\n"+
					"Raiting: "+membershipCard.getRating()
							);
			
		}	
		data.close();
	}
}
