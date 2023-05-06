package domain.hcl.homeworks.HM3.exercise3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner datails = new Scanner(System.in);
		InternationalPlayer interPlayer = new InternationalPlayer();
		
		System.out.println("Enter the player name");
		String nameInput = datails.nextLine();
		interPlayer.name = nameInput;
		
		System.out.println("Enter the player country");
		String countryInput = datails.nextLine();
		interPlayer.country = countryInput;
		
		System.out.println("Enter the Cap number");
		String capNumberInput = datails.nextLine();
		interPlayer.setCapNumber(capNumberInput);
		
		System.out.println("Enter the Number of test appearance");
		Long noTestAppInput = Long.parseLong(datails.nextLine());
		interPlayer.setNoOfTestAppearence(noTestAppInput);
		
		System.out.println("Number of ODI appearance");
		Long noOfODIAppInput = Long.parseLong(datails.nextLine());
		interPlayer.setNoOfODIAppearence(noOfODIAppInput);
		
		datails.close();
		interPlayer.displayDetails();
		/*
		 * how can i call the displayDetails method that is in Player class using interPlayer instance?
		 * 
		 *My approach is; we cannot, to do it we need to overload the method. am i correct?
		 */
	}

}
