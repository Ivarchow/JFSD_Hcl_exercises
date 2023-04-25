package domain.hcl.homeworks;
/*
 * Problem Statement:

Given the following program:

1. class Maybe {   

2.     public static void main(String[] args) {

3.         boolean b1 = true;

4.         boolean b2 = false;

5.         System.out.println(!false ^ false);

6.         System.out.println(" " + (!b1 & (b2 = true)));

7.         System.out.println(" " + (b2 ^ b1));

8.     }

9. }

 
Which are true?
a)       Line 5 produces true.
b)      Line 5 produces false. Correct
c)       Line 6 produces true.
d)      Line 6 produces false. correct
e)       Line 7 produces true.
f)        Line 7 produces false. correct 
 */

public class exercise9 {
	     public static void main(String[] args) {

		         boolean b1 = true;

		         boolean b2 = false;

		         System.out.println(!false ^ false);

		         System.out.println(" " + (!b1 & (b2 = true)));

		         System.out.println(" " + (b2 ^ b1));
	     }
}
