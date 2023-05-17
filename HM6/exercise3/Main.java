package domain.hcl.homeworks.HM6.exercise3;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		List<String> teamList =Arrays.asList("Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore");
		System.out.println("Enter the expected winner team of PL4 Season 4: ");
		String winnerName = data.nextLine();
		System.out.println("Enter the expected runner Team of IPL Season 4: ");
		String runnerPlayer = data.nextLine();

		if(!teamList.contains(winnerName)) {
			data.close();
			throw new CustomException("InvalidAgeRangeException, Team not found: "+winnerName);
		}else {
			System.out.println("Expected IPL season 4 winner: "+winnerName+"\n"+"Expected IPL Season 4 runner: "+runnerPlayer);
		}
		data.close();
	}

}
