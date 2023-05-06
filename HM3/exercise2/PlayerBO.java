package domain.hcl.homeworks.HM3.exercise2;

public class PlayerBO {
	
	void displayAllPlayerDetails(Player[] playerList) {
		System.out.println("Player Details: "+"\n");
		for(Player details: playerList) {
			
			System.out.println(
					details.getName()+", "+
					details.getCountry()+", "+
					details.getSkill());
		}
	}
}
