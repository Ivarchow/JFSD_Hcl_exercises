package domain.hcl.homeworks.HM4.exercise4;

public class Bowler extends CricketPlayer implements IPlayerStatistics{
	
	private Integer noOfWickets;
	
	Bowler(String name, String teamName, Integer noOfMatches,Integer noOfWickets){
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}
	
	public void displayPlayerStatistics() {
        System.out.println(
        		"Player name: " + getName()+"\n"+
        		"Team name: " + getTeamName()+"\n"+
        		"Number of matches: " + getNoOfMatches()+"\n"+
        		"Number of wickets: " + noOfWickets);
	}
}
