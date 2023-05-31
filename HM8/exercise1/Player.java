package domain.hcl.homeworks.HM8.exercise1;

public class Player implements Comparable<Player> {

	private String playerName, skill;
	private Long capNmber;
	
	Player(String playerName, String skill, Long capNumber){
		this.playerName = playerName;
		this.skill = skill;
		this.capNmber = capNumber;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Long getCapNmber() {
		return capNmber;
	}
	public void setCapNmber(Long capNmber) {
		this.capNmber = capNmber;
	}

	@Override
	public int compareTo(Player o) {
		if(capNmber == o.capNmber) {
			return 0;
		}else if(capNmber > o.capNmber) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
}
