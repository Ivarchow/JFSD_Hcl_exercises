package domain.hcl.homeworks.HM4.exercise4;

public class AllRounder extends CricketPlayer implements IPlayerStatistics{
	
	private Integer runs, noOfWickets;
	
	AllRounder(String name,String teamName,Integer noOfMatches,Integer runs,Integer noOfWickets){
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
		this.runs = runs;
	}
	
	public void displayPlayerStatistics() {
        System.out.println(
        		"Player name: " + getName()+"\n"+
        		"Team name: " + getTeamName()+"\n"+
        		"Number of matches: " + getNoOfMatches()+"\n"+
        		"Runs scored: " + runs+"\n"+
        		"Number of wicket taken: " +noOfWickets+"\n");
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(Integer noOfWickets) {
		this.noOfWickets = noOfWickets;
	}


	
}
