package domain.hcl.homeworks.HM5.exercise3;
import java.util.Scanner;

public class Main {
	Scanner data = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.println("Enter the team name adn the jersey number");
		String nameNjersey = data.nextLine();
		UserMainCode.validateTeam(nameNjersey);
		data.close();
	}

}
