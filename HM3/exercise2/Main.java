package domain.hcl.homeworks.HM3.exercise2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner details = new Scanner(System.in);
		PlayerBO playersDetails = new PlayerBO();
		
		System.out.println("Enter the number of players: ");
		int input = Integer.parseInt(details.nextLine());
		Player allPlayers[] = new Player[input];
		
		for(int loop = 0; loop<input; loop++) {
			
			System.out.println("Enter the player name");
			String nameValue = details.nextLine();
			
			System.out.println("Enter the player country");
			String countryValue = details.nextLine();
			
			System.out.println("Enter the player skill");
			String skillValue = details.nextLine();
			
			allPlayers[loop] = new Player(nameValue,countryValue,skillValue);
			
		}
		
		playersDetails.displayAllPlayerDetails(allPlayers);
		details.close();
	}

}
