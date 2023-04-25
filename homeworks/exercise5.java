package domain.hcl.homeworks;
/*
 * Problem Statement:
What is the output of the following program?
class Hexy {
     public static void main (String[] args)    {
         Integer i = 42;
         String s = (i<40)?"life" i>50)?"universe":"everything";
         System.out.println(s);
     }
}

A.           null
B.           life
C.           universe
D.          everything
E.           Compilation fails
F.           An exception is thrown at runtime. 

Solution: E, due to is wrongly written. 
if we fix the syntax: String s = (i<40)?"life":(i>50)?"universe":"everything";
Solution after changing the syntax: D.

 */

public class exercise5 {
    public static void main (String[] args)    {

        Integer i = 42;

        String s = (i<40)?"life":(i>50)?"universe":"everything";

        System.out.println(s);

    }

}
