package domain.hcl.homeworks.HM9.exercise3;
import java.util.Scanner;

interface Auth{
	String usrString = "Ivar";
	String passwordString = "ivar123";
	Boolean authentication(String usr, String pass);
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dataScanner = new Scanner(System.in);
		System.out.println("Enter the user: ");
		String usrString = dataScanner.nextLine();
		System.out.println("Enter password: ");
		String passString = dataScanner.nextLine();
		
		Auth auth = (String usr, String pass) -> {
			if(usr.equals(Auth.usrString)  && pass.equalsIgnoreCase(Auth.passwordString)) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(auth.authentication(usrString,passString));
		dataScanner.close();
	}

}
