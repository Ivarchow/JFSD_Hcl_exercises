package domain.hcl.homeworks.HM3.exercise4;

public class Square extends Shape {
	private Integer side;
	
	Square(Integer side){
		super("Square");
		this.side = side;
	}
	
	protected double calculateArea() {
		return side*side;
	}
}
