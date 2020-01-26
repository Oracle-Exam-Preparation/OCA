package com.trl.instanceof_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Test_4 {
    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if (f instanceof Flyer) System.out.println("f is a Flyer");
        if (e instanceof Bird) System.out.println("e is a Bird");
//        if(b instanceof Bird) System.out.println("b is a Bird");
//        if(b instanceof Integer) System.out.println("b is a Bird");
    }
}

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}