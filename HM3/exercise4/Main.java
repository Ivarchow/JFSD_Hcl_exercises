package domain.hcl.homeworks.HM3.exercise4;
import java.util.Scanner;

public class Main {
	static Scanner menuNumber = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(
		"Menu: "+"\n"+
		"1. Rectabgle"+"\n"+
		"2. Square"+"\n"+
		"3. Circle"+"\n"+
		"Area calcualtor -> Choose your shape"
		);
		String option = menuNumber.nextLine();
		menu(option);
	}

	static void menu(String number) {
		switch(number) {
		case "1":
			System.out.println("Enter the length and breadth");
			Integer inputLenght = Integer.parseInt(menuNumber.nextLine());
			Integer inputBreadth = Integer.parseInt(menuNumber.nextLine());
			Rectangle rectangle = new Rectangle(inputLenght,inputBreadth);
			System.out.println("Area of "+
					rectangle.shapeName+" is: "+
					String.format("%.2f", rectangle.calculateArea()));
			break;
		case "2":
			System.out.println("Enter side");
			Integer inputSide = Integer.parseInt(menuNumber.nextLine());
			Square square = new Square(inputSide);
			System.out.println("Area of "+
					square.shapeName+" is: "+
					String.format("%.2f", square.calculateArea()));
			break;
		case "3":
			System.out.println("Enter Radious");
			Integer inputRadious = Integer.parseInt(menuNumber.nextLine());
			Circle circle = new Circle(inputRadious);
			System.out.println("Area of "+
					circle.shapeName+" is: "+
					String.format("%.2f", circle.calculateArea()));
			break;
		default:
			System.out.println("Choose one of the options mentioned"+
					"Menu: "+"\n"+
					"1. Rectabgle"+"\n"+
					"2. Square"+"\n"+
					"3. Circle"+"\n"+
					"Area calcualtor -> Choose your shape"
					);
					String option = menuNumber.nextLine();
					menu(option);
			break;
		}
	}
}
