package domain.hcl.homeworks.HM4.exercise4;

public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
	
	private Integer noOfCatches, noOfStumpings, runs, noOfDismissals;
	
	WicketKeeper(String name,String teamName,Integer noOfMatches,Integer noOfCatches,Integer noOfStumpings,Integer runs,Integer noOfDismissals){
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.noOfDismissals = noOfDismissals;
		this.runs = runs;
	}
	
	public void displayPlayerStatistics() {
        System.out.println(
        		"Player name: " + getName()+"\n"+
        		"Team name: " + getTeamName()+"\n"+
        		"Number of matches: " + getNoOfMatches()+"\n"+
        		"Number of catches taken: " + noOfCatches+"\n"+
        		"Number of stumpings: " + noOfStumpings+"\n"+
        		"Number of dismissals: " + noOfDismissals+"\n"+
        		"Runs scored: " + runs);
	}

	public Integer getNoOfCatches() {
		return noOfCatches;
	}

	public void setNoOfCatches(Integer noOfCatches) {
		this.noOfCatches = noOfCatches;
	}

	public Integer getNoOfStumpings() {
		return noOfStumpings;
	}

	public void setNoOfStumpings(Integer noOfStumpings) {
		this.noOfStumpings = noOfStumpings;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getNoOfDismissals() {
		return noOfDismissals;
	}

	public void setNoOfDismissals(Integer noOfDismissals) {
		this.noOfDismissals = noOfDismissals;
	}
	
}
