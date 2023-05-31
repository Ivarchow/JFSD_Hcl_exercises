package domain.hcl.homeworks.HM8.exercise4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import domain.hcl.homeworks.HM8.exercise3.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dataScanner = new Scanner(System.in);
		List<Player> playersList = new ArrayList<Player>();
		TreeMap<Integer, Player> playerDetailsMap = new TreeMap<Integer, Player>();
		
		System.out.println("Enter the number of players: ");
		Integer noPlayerInteger = Integer.parseInt(dataScanner.nextLine());
		
		for(int index = 0; index < noPlayerInteger; index++) {
			System.out.printf("Enter the details of the player %d \n", (index+1));
			
			System.out.println("Enter the player cap number: ");
			Integer playerCapInteger = Integer.parseInt(dataScanner.nextLine());
			
			System.out.println("Enter the player name: ");
			String playerNameString = dataScanner.nextLine();
				
			System.out.println("Enter the player team: ");
			String playerTeamString = dataScanner.nextLine();
				
			System.out.println("Enter the player skill: ");
			String playerSlillString = dataScanner.nextLine();
			
			playersList.add(new Player(playerNameString, playerTeamString, playerSlillString));
			playerDetailsMap.put(playerCapInteger, playersList.get(index));
		}
		
		Set<Map.Entry<Integer, Player>> playerDetailsSet = playerDetailsMap.entrySet();
		
		for(Entry<Integer, Player> playersDetailsEntry : playerDetailsSet ) {
			System.out.println(playersDetailsEntry.getKey()+"--"+playersDetailsEntry.getValue().getName()+"--"+playersDetailsEntry.getValue().getTeam()+"--"+playersDetailsEntry.getValue().getSkill());
		}
		
		System.out.println("Enter the cap number of the player to be searched: ");
		Integer capNumberInteger = Integer.parseInt(dataScanner.nextLine());
		if(playerDetailsMap.containsKey(capNumberInteger)){
			System.out.println("Player details: \n"
				+playerDetailsMap.get(capNumberInteger).getName()
				+"--"
				+playerDetailsMap.get(capNumberInteger).getTeam()
				+"--"
				+playerDetailsMap.get(capNumberInteger).getSkill());
		}
		dataScanner.close();
		
	}

}
