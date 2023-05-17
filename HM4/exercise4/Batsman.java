package domain.hcl.homeworks.HM4.exercise4;

public class Batsman extends CricketPlayer implements IPlayerStatistics{
	
	private Integer runs;
	
	Batsman(String name, String teamName, Integer noOfMatches,Integer runs){
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}
	
	public void displayPlayerStatistics() {
        System.out.println(
        		"Player name: " + getName()+"\n"+
        		"Team name: " + getTeamName()+"\n"+
        		"Number of matches: " + getNoOfMatches()+"\n"+
        		"Number of runs: " + runs);
	}
}
