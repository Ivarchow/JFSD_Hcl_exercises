package domain.hcl.homeworks;

/*
 * Problem Statement:
Find out whether the following file will compile. If it does not compile, how you would fix it?

class Digit {
      public static void main(String[ ] args) {
       int x = 1;
       while (x < 10) {
          if (x > 3) {
              System.out.println(“big x”);
           }
       }
       }
 }
 Solution: It compiles, nothing to change
 */

public class exercise2 {
    public static void main(String[ ] args) {

        int x = 1;

        while (x < 10) {

		   if (x > 3) {
		
		        System.out.println("big" + x);
		   }

        }

    }
}
