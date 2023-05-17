package domain.hcl.homeworks.HM5.exercise4;

public class UserMainCode {
	
	static void display(String name1, String name2) {
		StringBuilder SBName1 = new StringBuilder(name1);
		SBName1.append(" ");
		SBName1.append(name2);
		String[] strArry = SBName1.toString().split(" ");
		if(strArry[1].equals(strArry[3])) {
			System.out.println(name1+"\n"+name2+"\nyes");
		}else {
			System.out.println(name1+"\n"+name2+"\nno");
		}
	}

	
}
