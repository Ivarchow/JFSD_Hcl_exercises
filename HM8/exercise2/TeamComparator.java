package domain.hcl.homeworks.HM8.exercise2;
import java.util.Comparator;

public class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		return o1.getNumberOfMatches().compareTo(o2.getNumberOfMatches());
	}
}
