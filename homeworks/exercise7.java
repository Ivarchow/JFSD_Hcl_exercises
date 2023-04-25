package domain.hcl.homeworks;
/*
 * Problem Statement:

What is the output of the following program?

class TryIt {

   

    public static void main(String[] args) {

        Integer x = 0;

        Integer y = 0;

        for(Short z = 0; z < 5; z++)

            if ((++x > 2) || (++y > 2))

                x++;

        System.out.println(x + " " + y);

    }

}
 */

public class exercise7 {
    public static void main(String[] args) {

        Integer x = 0;

        Integer y = 0;

        for(Short z = 0; z < 5; z++) //assign, increment; 0,1,2,3,4

            if ((++x > 2) || (++y > 2)) //increment, assign; (1,1,false), (2,2,true), (5,2,true),(6,2,true);  

                x++; //assign, increment; 1,

        System.out.println(x + " " + y);

    }

}
