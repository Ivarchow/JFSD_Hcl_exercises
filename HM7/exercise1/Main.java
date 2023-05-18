package domain.hcl.homeworks.HM7.exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Float result = 0.0F;
		Integer sum = 0;
		Scanner data = new Scanner(System.in);
		System.out.println("Enter the number of matches played: ");
		Integer intNoOfPlays = Integer.parseInt(data.nextLine());
		ArrayList<Integer> runsScored = new ArrayList<Integer>();
		
		for(int tempIndex = 0; tempIndex < intNoOfPlays; tempIndex++  ) {
			
			System.out.printf("Enter the run scored %d\n",(tempIndex+1)); 
			Integer intRuns = Integer.parseInt(data.nextLine());
			runsScored.add(intRuns);
			sum += (runsScored.get(tempIndex));
			
		}
		data.close();
		result = (float)sum/(float)intNoOfPlays;
		System.out.println(sum+"\n"+result);
		
	}

}
