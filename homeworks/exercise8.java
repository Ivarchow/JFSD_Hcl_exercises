package domain.hcl.homeworks;
/*
 * Problem Statement:

What is the output of the following program?

class Titanic {

   

    public static void main(String[] args)     {

        Boolean b1 = true;

        Boolean b2 = false;

        Boolean b3 = true;

        if ((b1 & b2) | (b2 & b3) & b3)

            System.out.println("alpha ");

        if ((b1 = false) | (b1 & b3) | (b1 | b2))

            System.out.println("beta ");

    }

}

a)       beta
b)      alpha
c)       alpha beta
d)      Compilation fails.
e)       No output is produced.
f)        An exception is thrown at runtime.

Solution: E, due to the or and and expression. ||, &&
 */

public class exercise8 {
	 public static void main(String[] args)     {

	        Boolean b1 = true;

	        Boolean b2 = false;

	        Boolean b3 = true;

	        if ((b1 & b2) | (b2 & b3) & b3)

	            System.out.println("alpha ");

	        if ((b1 = false) | (b1 & b3) | (b1 | b2))

	            System.out.println("beta ");
	    }
}
