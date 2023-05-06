package domain.hcl.homeworks.HM1;
/*
 * Problem Statement:

Given:

1. class Example {   

2.     public static void main(String[] args) {

3.        Short s = 15;

4.        Boolean b;

5.        // insert code here

6.    }

7.}


Which, inserted independently at line 5, will compile? (Choose all that apply.)

A.           b  =  (Number instanceof s); 
B.           b  =  (s instanceof Short); 
C.           b  =  s.instanceof (Short); 
D.           b  =  (s.instanceof Number);
E.           b  =  s.instanceof (Object); 
F.           b  =  (s instanceof String); 

Solution: B
 */

public class exercise6 {
	     public static void main(String[] args) {

		        Short s = 15;

		        Boolean b;

		        b  =  (s instanceof Short);

		    }
}
