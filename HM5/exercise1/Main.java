package domain.hcl.homeworks.HM5.exercise1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner data = new Scanner(System.in);
		Team team = new Team();
		System.out.println("Enter the team details separated by #: ");
		String details = data.nextLine();
		String[] words = details.split("\\#");
		team.setName(words[0]);
		team.setCoach(words[1]);
		team.setLocation(words[2]);
		team.setPlayers(words[3]);
		team.setCaptain(words[4]);
		System.out.println(
		"Team: "+team.getName()+"\n"+
		"Coach: "+team.getCoach()+"\n"+
		"Location: "+team.getLocation()+"\n"+
		"Players: "+team.getPlayers()+"\n"+
		"Captain: "+team.getCaptain()+"\n"
				);
		data.close();
	}

}
