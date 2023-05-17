package domain.hcl.homeworks.HM4.exercise4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Scanner data = new Scanner(System.in);
	static ArrayList<String> array = new ArrayList<String>();
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println(
		"Menu\r\n"
		+ "\r\n"
		+ "1.Bowler\r\n"
		+ "\r\n"
		+ "2.Batsman\r\n"
		+ "\r\n"
		+ "3.WicketKeeper\r\n"
		+ "\r\n"
		+ "4.AllRounder\r\n"
		+ "\r\n"
		+ "Enter your choice"
				
				);
		String option = data.nextLine();
		switch (option) {
		case "1":
			String[] bowlerStr = new String[]{"Enter player name","Enter team name","Enter number of matches played","Enter number of wickets taken"};
			
			System.out.printf("Enter the %s details \n\n", "Bowler");
			
			for(int bowlerIndex = 0; bowlerIndex < bowlerStr.length; bowlerIndex++) {
				System.out.println(bowlerStr[bowlerIndex]);
				String batsmanValues = data.nextLine();
				array.add(batsmanValues);
			}
			Bowler bowler = new Bowler(array.get(0),array.get(1),Integer.parseInt(array.get(2)),Integer.parseInt(array.get(3)));
			bowler.displayPlayerStatistics();
			array.clear();
			appear();
			
			break;
		case "2":
			String[] batsmanStr = new String[]{"Enter player name","Enter team name","Enter number of matches played","Enter the runs scored"};
			
			System.out.printf("Enter the %s details \n\n", "Batsman");
			
			for(int batsmanIndex = 0; batsmanIndex < batsmanStr.length; batsmanIndex++) {
				System.out.println(batsmanStr[batsmanIndex]);
				String batsmanValues = data.nextLine();
				array.add(batsmanValues);
			}
			Batsman batsman = new Batsman(array.get(0),array.get(1),Integer.parseInt(array.get(2)),Integer.parseInt(array.get(3)));
			batsman.displayPlayerStatistics();
			array.clear();
			appear();
			break;
		case "3":
	
			String[] wicketKeeperStr = new String[]{"Enter player name","Enter team name","Enter number of matches played","Enter number of catches taken","Enter number of stumpings","Enter number of dismissals","Enter the runs scored"};
			
			System.out.printf("Enter the %s details \n\n", "WicketKeeper");
			
			for(int wicketKeeperIndex = 0; wicketKeeperIndex < wicketKeeperStr.length; wicketKeeperIndex++) {
				System.out.println(wicketKeeperStr[wicketKeeperIndex]);
				String wicketKeeperValues = data.nextLine();
				array.add(wicketKeeperValues);
			}
			WicketKeeper wicketKeeper = new WicketKeeper(array.get(0),array.get(1),Integer.parseInt(array.get(2)),Integer.parseInt(array.get(3)),Integer.parseInt(array.get(4)),Integer.parseInt(array.get(5)),Integer.parseInt(array.get(6)));
			wicketKeeper.displayPlayerStatistics();
			array.clear();
			appear();
			break;
		case "4":
			String[] allRounderStr = new String[]{"Enter player name","Enter team name","Enter number of matches played","Enter the runs scored","Enter number of wickets taken"};
			
			System.out.printf("Enter the %s details \n\n", "AllRounder");
			
			for(int allRounderIndex = 0; allRounderIndex < allRounderStr.length; allRounderIndex++) {
				System.out.println(allRounderStr[allRounderIndex]);
				String allRounderValues = data.nextLine();
				array.add(allRounderValues);
			}
			AllRounder allRounder = new AllRounder(array.get(0),array.get(1),Integer.parseInt(array.get(2)),Integer.parseInt(array.get(3)),Integer.parseInt(array.get(4)));
			allRounder.displayPlayerStatistics();
			array.clear();
			appear();
			
			break;
		default:
			System.out.println("choose an option mentioned");
			menu();
			break;
		}
	}
	
	static void appear() {
		System.out.println("would you like to continue?");
		String yesNoOption = data.nextLine();
		if(yesNoOption.equals("yes")) {
			menu();
		}else {
			System.out.println("\nBye");
			data.close();
		}
	}

}
