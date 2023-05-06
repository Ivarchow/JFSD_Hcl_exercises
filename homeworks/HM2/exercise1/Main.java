package domain.hcl.homeworks.HM2.exercise1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Venue class_venue_values = new Venue();
		
		Scanner venue_scan = new Scanner(System.in);
		System.out.println("Enter the Venue name");
		class_venue_values.name = venue_scan.nextLine();
		
		Scanner city_scan = new Scanner(System.in);
		System.out.println("Enter the City name");
		class_venue_values.city = city_scan.nextLine();
		
		System.out.println("Venue Details:");
		System.out.println(class_venue_values.name+"\n"+class_venue_values.city);
		
		venue_scan.close();
		city_scan.close();
	}
}
