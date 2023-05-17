package domain.hcl.homeworks.HM5.exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter the number of wickets: ");
		String numberWickets = data.nextLine();
		Integer intNUmbrWickets = Integer.parseInt(numberWickets);
		Object[] array = new Object[intNUmbrWickets];
		
		for(int index = 0; index < intNUmbrWickets; index ++) {
			System.out.println("Enter the details of wicked "+(index+1));
			array[index] = data.nextLine();
		}
		
		for(int index1 = 0; index1 < array.length; index1++) {
			String temp = (String)array[index1];
			String[] values = temp.split(",");
			Wicket wicket = new Wicket(Long.parseLong(values[0]), Long.parseLong(values[1]), values[2], values[3], values[4]);
			System.out.println("Wicket Detail: \n"
						+ "Over : "+ wicket.getOver()
						+ "\nBall : "+wicket.getBall()
						+ "\nWicket Type : " +wicket.getWicketType()
						+ "\nPlayer Name : "+wicket.getPlayerName()
						+ "\nBowler Name : "+wicket.getBowlerName()+"\n");	
		}
		data.close();
			
	}

}
