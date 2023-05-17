package domain.hcl.homeworks.HM4.exercise1;

public class Circle extends Shape{
	
	private Integer radious;
	
	Circle(String name, Integer radious){
		super(name);
		this.radious = radious;
	}

	public Integer getRadious() {
		return radious;
	}

	public void setRadious(Integer radious) {
		this.radious = radious;
	}
	
	public float calculateArea() {
		return (float)3.14*radious*radious; 
	}
	
}
