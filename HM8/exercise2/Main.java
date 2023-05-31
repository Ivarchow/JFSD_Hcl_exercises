package domain.hcl.homeworks.HM8.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dataScanner = new Scanner(System.in);
		System.out.println("Enter the number of teams:");
		Integer playerInteger = Integer.parseInt(dataScanner.nextLine());
		List<Team> playerList = new ArrayList<Team>();
		
		for(int index =0; index < playerInteger; index++) {
			System.out.printf("Enter team %d detail: \nEnter name: ", (index+1));
			String playerNameString = dataScanner.nextLine();
			
			System.out.println("Enter number of matches: ");
			Long matchesLong = Long.parseLong(dataScanner.nextLine());
			playerList.add(new Team(playerNameString, matchesLong));
		}
		dataScanner.close();
		Collections.sort(playerList, new TeamComparator());
		for(Team teams : playerList) {
			System.out.println("Team list after sort by number of matches \n"+teams.getNumberOfMatches());
		}
	}

}
