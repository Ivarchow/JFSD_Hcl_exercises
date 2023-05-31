package domain.hcl.homeworks.HM9.exercise4;

interface MethodReference{
	void reference();
}
interface CompleteName{
	public String completeNameMethod(String name, String lastName);
}

public class Main {
	//Members
	private String name, lastName;
	
	//setter and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastNameString) {
		this.lastName = lastNameString;
	}
	
	//methods
	public static void reference1() {
		System.out.println("reference 1");
	}
	public String completeName(String name, String lastName) {
		return lastName+", "+name;
	}

	//Main
	public static void main(String[] args) {
		Main mainName = new Main();
		mainName.setLastName("Alvarez");
		mainName.setName("Ivar");
		MethodReference MR = Main::reference1;
		MR.reference();
		
		CompleteName completeName = mainName::completeName;
		String compelteNameString = completeName.completeNameMethod(mainName.getLastName(),mainName.getName());
		System.out.println(compelteNameString);

	}

}
