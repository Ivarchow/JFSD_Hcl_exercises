package domain.hcl.homeworks.HM9.exercise5;
import java.util.Scanner;

@FunctionalInterface
interface FactorialInterface{
	long factorialMethod(long num);
}
public class Main {

	static long calculateFactorial(long num) {
		int fact = 1;
		
		for(int index = 1 ; index <= num; index++) {
			fact *= index;
		}
		return fact;
	}

	public static void main(String[] args) {
	Scanner dataScanner = new Scanner(System.in);
	FactorialInterface objFactorialInterface = Main::calculateFactorial;
	
	
	System.out.println("Enter a number: ");
	Long numberInteger = Long.valueOf(dataScanner.nextLine());
	
	Long factoriaLong = objFactorialInterface.factorialMethod(numberInteger);
	System.out.println(factoriaLong);
	
	dataScanner.close();
	

	
	}

}
