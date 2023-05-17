package domain.hcl.homeworks.HM6.exercise2;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String playerName = data.nextLine();
		System.out.println("Enter the player age: ");
		String playerAge = data.nextLine();
		Integer intPlayerAge = Integer.parseInt(playerAge);
		if(intPlayerAge<19) {
			data.close();
			throw new CustomException("InvalidAgeRangeException, Age: "+intPlayerAge);
		}else {
			System.out.println("Player name: "+playerName+"\n"+"Player age: "+playerAge);
		}
		data.close();
	}

}
