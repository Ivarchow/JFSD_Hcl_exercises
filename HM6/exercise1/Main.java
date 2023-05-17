package domain.hcl.homeworks.HM6.exercise1;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {

		try {
			
			Scanner data = new Scanner(System.in);
			System.out.println("Enter the number of overs");
			String noOfOvers = data.nextLine();
			Integer intnoOfOvers = Integer.parseInt(noOfOvers);
			
			String[] arrOvers = new String[intnoOfOvers];
			System.out.println("Enter the number of runs for each over: ");
			
			for(int index = 0; index < arrOvers.length; index++) {
				System.out.println((index+1)+") : ");
				arrOvers[index] = data.nextLine();
			}
			System.out.println("Enter the over number: ");
			String overNo = data.nextLine();
			Integer intOverNo = Integer.parseInt(overNo);
			System.out.println("Runs scored in this over: "+arrOvers[intOverNo-1]);
			data.close();
		}catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	
}
