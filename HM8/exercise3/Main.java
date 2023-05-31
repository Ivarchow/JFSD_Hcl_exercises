package domain.hcl.homeworks.HM8.exercise3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner dataScanner = new Scanner(System.in);
		List<Player> playersList = new ArrayList<Player>();
		TreeMap<Integer, Player> playersTreeMap = new TreeMap<>();
		System.out.println("Enter the number of players: ");
		
		Integer noPlayerInteger = Integer.parseInt(dataScanner.nextLine());
		
		for(int index = 0; index < noPlayerInteger; index++) {
			System.out.printf("Enter the details of the player %d \n", (index+1));
				
			System.out.println("Enter the player cap number: ");
			Integer playerCapString = Integer.parseInt(dataScanner.nextLine());
			
			System.out.println("Enter the player name: ");
			String playerNameString = dataScanner.nextLine();
				
			System.out.println("Enter the player team: ");
			String playerTeamString = dataScanner.nextLine();
				
			System.out.println("Enter the player skill: ");
			String playerSlillString = dataScanner.nextLine();
				
			playersList.add(new Player(playerNameString, playerTeamString, playerSlillString));
			playersTreeMap.put(playerCapString, playersList.get(index));

		}
		Set<Map.Entry<Integer, Player>> playerDetailsSet = playersTreeMap.entrySet();
		
		for(Map.Entry<Integer, Player> details : playerDetailsSet) {
			System.out.println(details.getKey()+"--"+details.getValue().getName()+"--"+details.getValue().getTeam()+"--"+details.getValue().getSkill());
		}
		dataScanner.close();
	}

}
