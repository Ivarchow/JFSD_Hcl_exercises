package domain.hcl.homeworks.HM4.exercise6;
/*
 * Problem Statement:

What is the output of the following program?

 

class Mixer {   

    Mixer() { }

    Mixer(Mixer m) { m1 = m; }

    Mixer m1;

    public static void main(String[ ] args) {

        Mixer m2 = new Mixer();

        Mixer m3 = new Mixer(m2);

        m3.go();

        Mixer m4 = m3.m1;

        m4.go();

        Mixer m5 = m2.m1;

        m5.go();

    }

    void go() {

        System.out.println("hi ");

    }

}

 */

public class Mixer {

	   Mixer() { }

	    Mixer(Mixer m) { m1 = m; }//m1 = m = m2

	    Mixer m1;

	    public static void main(String[ ] args) {

	        Mixer m2 = new Mixer();

	        Mixer m3 = new Mixer(m2);//m3 = m1 = m =m2 -> m3=m2

	        m3.go();//hi

	        Mixer m4 = m3.m1; //m4 = (m3.m1)= m2 -> m4 = m2

	        m4.go(); //hi

	        Mixer m5 = m2.m1; // m5 = ()

	        m5.go(); //Not expliclitly initialzed (error) 

	    }

	    void go() {

	        System.out.println("hi ");

	    }
}
