package domain.hcl.homeworks.HM3.exercise4;

public class Rectangle extends Shape{
	private Integer length, breadth;

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
	
	Rectangle(Integer length, Integer breadth){
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	protected double calculateArea() {
		return breadth*length;
	}
	
}
