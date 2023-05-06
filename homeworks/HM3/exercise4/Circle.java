package domain.hcl.homeworks.HM3.exercise4;

public class Circle extends Shape {
	private Integer radious;
	
	Circle(Integer radious){
		super("Circle");
		this.radious = radious;
	}

	public Integer getRadious() {
		return radious;
	}

	public void setRadious(Integer radious) {
		this.radious = radious;
	}
	
	protected double calculateArea() {
		return 3.1416*radious*radious;
	}
}
