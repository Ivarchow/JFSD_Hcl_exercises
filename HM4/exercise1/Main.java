package domain.hcl.homeworks.HM4.exercise1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.println(
				"Circle"+"\n"+
				"Square"+"\n"+
				"Rectangle"+"\n"+
				"Enter the shape name: ");
		String shapeName = data.nextLine();
		if(shapeName.equals("circle")) {
			System.out.println("Enter the radious: ");
			String radiousValue = data.nextLine();
			Integer integerRadiousValue = Integer.parseInt(radiousValue);
			Circle circle = new Circle(shapeName,integerRadiousValue);
			System.out.println(
					"Area of "+circle.name+" is "+
			String.format("%.2f", circle.calculateArea()));
			
		}else if(shapeName.equals("square")) {
			System.out.println("Enter the side: ");
			String sideValue = data.nextLine();
			Integer integerSideValue = Integer.parseInt(sideValue);
			Square square = new Square(shapeName,integerSideValue);
			System.out.println(
					"Area of "+square.name+" is "+
			String.format("%.2f", square.calculateArea()));
			
		}else if(shapeName.equals("rectangle")) {
			System.out.println("Enter the length: ");
			String lengthValue = data.nextLine();
			
			System.out.println("Enter the breadth: ");
			String breadthValue = data.nextLine();
			
			Integer integerLengthValue = Integer.parseInt(lengthValue);
			Integer integerBreadthValue = Integer.parseInt(breadthValue);
			
			
			Rectangle rectangle = new Rectangle(shapeName,integerLengthValue,integerBreadthValue);
			
			
			System.out.println(
					"Area of "+rectangle.name+" is "+
			String.format("%.2f", rectangle.calculateArea()));
		}
		data.close();
	}

}
