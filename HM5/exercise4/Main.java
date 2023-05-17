package domain.hcl.homeworks.HM5.exercise4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		System.out.println("first name: ");
		String name1 = data.nextLine();
		System.out.println("Second name: ");
		String name2 = data.nextLine();
		
		UserMainCode.display(name1, name2);
		data.close();
	}

}
