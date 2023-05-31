package domain.hcl.homeworks.HM9.exercise2;

interface Space{
	String spaceString(String A, String B);
}

public class Main {

	public static void main(String[] args) {
		
		Space spaces = (String A, String B) ->  A+" "+B;
		
		System.out.println(spaces.spaceString("C", "G"));
	}

}
