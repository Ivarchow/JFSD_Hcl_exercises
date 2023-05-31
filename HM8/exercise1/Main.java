package domain.hcl.homeworks.HM8.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		Integer noOfPlayers = Integer.parseInt(data.nextLine());
		List<Player> playerList = new ArrayList<Player>();
		
		for(int index = 0; index < noOfPlayers; index++) {
			System.out.printf("Enter player %s details: \n", (index+1));
			System.out.println("Enter name: ");
			String playerName = data.nextLine();
			System.out.println("Enter skill: ");
			String playerSkill = data.nextLine();
			System.out.println("Enter cap number: ");
			Long playerCap = Long.parseLong(data.nextLine());
			playerList.add(new Player(playerName, playerSkill, playerCap));
		}
		data.close();
		Collections.sort(playerList, Collections.reverseOrder());
		for(Player players: playerList) {
			System.out.println(players.getPlayerName()+"-"+players.getCapNmber());
		}
	}

}
