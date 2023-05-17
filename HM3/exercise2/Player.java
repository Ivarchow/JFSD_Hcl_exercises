package domain.hcl.homeworks.HM3.exercise2;

public class Player {
	private String name, country, skill;

	Player(String name, String country, String skill){
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String toString() {
		return name+" "+country+" "+skill;
	}
}
