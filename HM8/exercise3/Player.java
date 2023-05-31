package domain.hcl.homeworks.HM8.exercise3;

public class Player {
		private String name, team, skill;
		
		public Player(String name, String team, String skill) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.skill = skill;
			this.team = team;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		public String getSkill() {
			return skill;
		}
		public void setSkill(String skill) {
			this.skill = skill;
		}
}
