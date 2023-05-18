package domain.hcl.homeworks.HM7.exercise2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		String[] words = new String[] {"home ground","other ground"};
		ArrayList<Integer> runsScored = new ArrayList<Integer>();
		System.out.println("Enter the team name");
		String teamName = data.nextLine();
		
		for(int index = 0; index < words.length; index++) {
			System.out.printf("Enter the number of matches played in %s\n", words[index]);
			Integer hg = Integer.parseInt(data.nextLine());
			System.out.println("Enter the runs scored: ");
			for(int index1 = 0; index1 < hg; index1++) {
				Integer runs = Integer.parseInt(data.nextLine());
				runsScored.add(runs);
			}
		}
		data.close();
		System.out.printf("Runs scored by %s\n", teamName);
		for(Integer runs : runsScored) {
			System.out.println(runs);
		}
		System.out.printf("Runs scored by %s more than 300", teamName);
		for(int index1 = 0; index1 < runsScored.size() ; index1++) {
			System.out.println((runsScored.get(index1) > 300 ? runsScored.get(index1) : ""));
		}
	}
}
