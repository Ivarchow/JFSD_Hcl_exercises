package domain.hcl.homeworks.HM2.exercise3;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {
	public static void main(String[] args) {
		String[] data = new String[] {"over","ball","runs","batsman","bowler","nonStriker"};
		ArrayList<String> dataSaved = new ArrayList<String>();
		Scanner word_value = new Scanner(System.in);
		
		for(int word = 0; word<data.length ; word++) {
				System.out.println("Enter the "+data[word]);
				String stringValues = word_value.nextLine();
				dataSaved.add(stringValues);
		}
		word_value.close();
		Delivery delivery1 = new Delivery();
		delivery1.over = Long.parseLong(dataSaved.get(0));
		delivery1.ball = Long.parseLong(dataSaved.get(1));
		delivery1.runs = Long.parseLong(dataSaved.get(2));
		delivery1.batsman = dataSaved.get(3);
		delivery1.bowler = dataSaved.get(4);
		delivery1.nonStriker = dataSaved.get(5);
		delivery1.displayDeliveryDetails();
	}
}
