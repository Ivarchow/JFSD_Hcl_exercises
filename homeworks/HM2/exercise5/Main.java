package domain.hcl.homeworks.HM2.exercise5;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		String[] words = new String[] {"Venue name: ","City name: "};
		ArrayList<String> namesSaved = new ArrayList<String>();
		Scanner data = new Scanner(System.in);
		Venue venueDetails = new Venue();
		
		for(int index = 0; index<words.length; index++) {
			System.out.println("Enter the "+words[index]);
			String names = data.nextLine();
			namesSaved.add(names);
		}
		
		venueDetails.setName(namesSaved.get(0));
		venueDetails.setCity(namesSaved.get(1));
		
		System.out.println(
				"Venue Details: "+"\n"+
		words[0]+venueDetails.getName()+"\n"+
		words[1]+venueDetails.getCity()+"\n");
		menu(venueDetails);
		data.close();
		
		
	}
	
	public static void menu(Venue newVenue) {
		Scanner option = new Scanner(System.in);
		Scanner option1 = new Scanner(System.in);
		Scanner option2 = new Scanner(System.in);
		
		System.out.println(
				"Verify and update Venue Details: "+"\n"+
				"1. Update Venue Name"+"\n"+
				"2. Update City name"+"\n"+
				"3. All info is correct(Exit)");
		String optionSelected = option.nextLine(); 
		
		switch(optionSelected) {
		case "1":
			System.out.println("Enter the new Name: ");
			String option1Selected = option.nextLine();
			newVenue.setName(option1Selected);
			System.out.println(
					"Venue Details: "+"\n"+
			"Venue name: "+newVenue.getName()+"\n"+
			"city name: "+newVenue.getCity()+"\n");
			menu(newVenue);
			option1.close();
			break;
		case "2":
			System.out.println("Enter the new City: ");
			String option2Selected = option.nextLine();
			newVenue.setCity(option2Selected);
			System.out.println(
					"Venue Details: "+"\n"+
			"Vanue name: "+newVenue.getName()+"\n"+
			"city name: "+newVenue.getCity()+"\n");
			menu(newVenue);
			option2.close();
			break;
		case "3":
			System.out.println(
					"Venue Details: "+"\n"+
			"Vanue name: "+newVenue.getName()+"\n"+
			"city name: "+newVenue.getCity()+"\n");
			break;
		default:
			System.out.println("Select one of the options mentioned"+"\n");
			menu(newVenue);
		}
		option.close();
	}
}
