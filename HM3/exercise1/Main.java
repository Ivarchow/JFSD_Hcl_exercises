package domain.hcl.homeworks.HM3.exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		String[] words = new String[] {"Venue name: ","City name: "};
		ArrayList<String> namesSaved = new ArrayList<String>();
		Scanner data = new Scanner(System.in);
		Venue venueDetails = new Venue();
		Venue venueDetails1 = new Venue("M Chidhambaram Stadium","Chennai");
		VenueBO venueBO = new VenueBO();
		
		for(int index = 0; index<words.length; index++) {
			System.out.println("Enter the "+words[index]);
			String names = data.nextLine();
			namesSaved.add(names);
		}
		
		venueDetails.setName(namesSaved.get(0));
		venueDetails.setCity(namesSaved.get(1));
		System.out.println(venueDetails.toString());
		venueBO.displayVenueDetails(venueDetails1);
		data.close();
	}
}
