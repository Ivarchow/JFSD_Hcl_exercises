package domain.hcl.homeworks.HM5.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserMainCode {
	static List<String> arr = new ArrayList<String>(Arrays.asList("RCB", "MI", "CSK","SRH","KXIP", "DD","KKR", "RPSG","GL"));

	static Boolean validateTeam(String name) {
		String[] jerseyName = name.split(" ");
		if(arr.contains(jerseyName[0])) {
			System.out.println(jerseyName[0]+" "+jerseyName[1]+"\nValid");
			return true;
		}else {
			System.out.println(jerseyName[0]+" "+jerseyName[1]+"\nInvalid");
			return false;
		}
	}
}
