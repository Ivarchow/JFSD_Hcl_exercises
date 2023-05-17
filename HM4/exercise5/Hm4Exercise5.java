package domain.hcl.homeworks.HM4.exercise5;

/*
 * Problem Statement:

What is the output of the following program?

class Eggs {   

    int doX(Long x, Long y) { return 1;}

    int doX(long... x) { return 2;}

    int doX(Integer x, Integer y) { return 3; }

    int doX(Number n, Number m) { return 4; }

   

    public static void main(String[ ] args) {

        new Eggs().go();

    }

 

    void go() {

        short s = 7;

        System.out.println(doX(s,s) + " ");

        System.out.println(doX(7,7));

    }

}


A.           1  1

B.           2  1

C.           3  1

D.          4  1

E.           2  3

F.           3  3

G.          4  3

Solution: G, because The abstract class Number is the superclass of platform 
classes representing numeric values that are convertible to the primitive types byte, 
double, float, int, long, and short.
in addition, 7 has the integer type there fore int doX with integer will be called
 */



public class Hm4Exercise5 {
	
	   int doX(Long x, Long y) { return 1;}

	    int doX(long... x) { return 2;}

	    int doX(Integer x, Integer y) { return 3; }

	    int doX(Number n, Number m) { return 4; }
	    
	    public static void main(String[ ] args) {

	        new Hm4Exercise5().go();

	    }

	    void go() {

	        short s = 7;

	        System.out.println(doX(s,s) + " ");

	        System.out.println(doX(7,7));

	    }
}
