package domain.hcl.homeworks;
/*
 * Problem Statement:

Find out whether the following file will compile. If it does not compile, how you would fix it?

class Loop {
          int x = 5;
          while (x  > 1) {
          	x = x - 1;   
            if (x < 3) {
               System.out.println(“small x”);
            }
           }
}

Solution: i added the PSMV method to run the program
 */
public class exercise3 {
	public static void main(String[] args) {
	    int x = 5;
	    while (x  > 1) {
	    	x = x - 1;
		    if (x < 3) {
		    	System.out.println("small" + x);
		    }
	    }
	}
}