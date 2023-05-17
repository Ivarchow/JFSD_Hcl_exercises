package domain.hcl.homeworks.HM4.exercise3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter player name: ");
		String name = data.nextLine();
		
		System.out.println("Enter team name: ");
		String teamName = data.nextLine();
		
		System.out.println("Enter the number of matches played: ");
		String matches = data.nextLine();
		Integer intMatches = Integer.parseInt(matches);
		
		System.out.println("Enter total runs scored: ");
		String runsScored = data.nextLine();
		Long intRunsScored = Long.parseLong(runsScored);
		
		System.out.println("Enter number of wickets taken: ");
		String wickets = data.nextLine();
		Integer intWickets = Integer.parseInt(wickets);
		
		Player player = new Player(name,teamName,intMatches,intWickets,intRunsScored);
		data.close();
		player.displayPlayerStatistics();
	}

}
