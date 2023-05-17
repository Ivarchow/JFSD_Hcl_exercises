package domain.hcl.homeworks.HM2.exercise2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Player player_details = new Player();

		Scanner playerName = new Scanner(System.in);
		System.out.println("Enter the player name");
		String nameValue = playerName.nextLine();
		player_details.name = nameValue;
		
		Scanner playerCountry = new Scanner(System.in);
		System.out.println("Enter the player country");
		String countryValue = playerCountry.nextLine();
		player_details.country = countryValue;
		
		Scanner playerSkill = new Scanner(System.in);
		System.out.println("Enter the player skill");
		String skillValue = playerSkill.nextLine();
		player_details.skill = skillValue;

		System.out.println("Player details:");
		System.out.println("Player Name: "+player_details.name);
		System.out.println("Player Country: "+player_details.country);
		System.out.println("Player Skill: "+player_details.skill);
		
		playerName.close();
		playerCountry.close();
		playerSkill.close();
	}		
}
