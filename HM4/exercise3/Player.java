package domain.hcl.homeworks.HM4.exercise3;

public class Player implements IPlayerStatistics{

	private String name, teamName;
	private Integer noOfMatches, noOfWicketsTaken;
	private Long totalRunsScored;
	
	Player(String name, String teamName, Integer noOfMatches, Integer noOfWicketsTaken, Long totalRunsScored){
		this.name = name; 
		this.teamName = teamName;
		this.noOfMatches = noOfMatches; 
		this.noOfWicketsTaken = noOfWicketsTaken;
		this.totalRunsScored = totalRunsScored;
	}
	
	public void displayPlayerStatistics() {
		System.out.println(
		"Player Details: "+"\n"+
		"Player name: "+name+"\n"+
		"Team name: "+teamName+"\n"+
		"No of matches: "+noOfMatches+"\n"+
		"Total runscored: "+totalRunsScored+"\n"+
		"No of wickets taken: "+noOfWicketsTaken
		);
	}
}
