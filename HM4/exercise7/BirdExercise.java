package domain.hcl.homeworks.HM4.exercise7;

/*
 * Problem Statement:

What is the output of the following program?

 

class Bird {   

    { System.out.print("b1 "); }

   

    public Bird() {

        System.out.print("b2 ");

    }

}

 

class Raptor extends Bird {

    static { System.out.print("r1 "); }

   

    public Raptor() {

        System.out.print("r2 ");

    }

   

    { System.out.print("r3 "); }

   

    static { System.out.print("r4 "); }

}

 

class Hawk extends Raptor {

    public static void main(String[] args) {

        System.out.print("pre ");

        new Hawk();

        System.out.println("hawk ");

    }

}

Solution: pre,  new hawk() calls Raptors constructor and similarly Raptor calls Birds constructor, therefore after pre
we have b1, b2, comes back to Raptor and prints, r4 because all the statics blocks initializes first, r1, r2 and r3 
and at the end we have hawk

pre b1 b2 r4 r1 r2 r3 hawk

Answer: 
 

A.           pre b1 b2 r3 r2 hawk

B.           pre b2 b1 r2 r3 hawk

C.           pre b2 b1 r2 r3 hawk r1 r4

D.          r1 r4 pre b1 b2 r3 r2 hawk

E.           r1 r4 pre b2 b1 r2 r3 hawk

F.           pre r1 r4 b1 b2 r3 r2 hawk

G.          pre r1 r4 b2 b1 r2 r3 hawk

H.          The order of output cannot be predicted.

I.            Compilation fails.
 */
public class BirdExercise {

}
