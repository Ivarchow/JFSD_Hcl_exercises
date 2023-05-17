package domain.hcl.homeworks.HM4.exercise1;

public abstract class Shape {
	protected String name;

	Shape(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract float calculateArea();
}
