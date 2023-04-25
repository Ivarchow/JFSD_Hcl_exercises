package domain.hcl.homeworks;
/*
 * Problem Statement:
Find out whether the following file will compile. If it does not compile, how you would fix it?
public static void main(String[ ] args) {
      int x = 5;
      while (x > 1) {
          x = x + 1;
          if (x < 3) {
               System.out.println(“small x”);
          }
      }
}

Solution: 
	x = x - 1;
 */
public class exercise1 {
	public static void main(String[ ] args) {

	      int x = 5;

	      while (x > 1) {

	          x = x - 1;

	          if (x < 3) {

	               System.out.println("small " + x);
	          }
	      }
	}
}
