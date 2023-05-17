package domain.hcl.homeworks.HM4.exercise1;

public class Square extends Shape{
	
	private Integer side;
	
	Square(String name, Integer side){
		super(name);
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}
	
	public float calculateArea() {
		return side*side;
	}
}
