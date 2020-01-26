package com.trl.others;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Interview {

}


class Practice {
    public static void main(String... args) {
//        Boolean b = new Boolean("/true");
        Boolean b = new Boolean("true");
        System.out.println(b);
    }

    public static void main(String args) {
        Boolean b = new Boolean("/false");
        System.out.println(b == false);
    }
}


class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splender extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splender();//upcasting
        b.run();
    }
}

class Bike2 {
    int speedlimit = 90;

    public int getSpeedlimit() {
        return speedlimit;
    }
}

class Honda3 extends Bike2 {
    int speedlimit = 150;

    @Override
    public int getSpeedlimit() {
        return speedlimit;
    }

    public static void main(String args[]) {
        Bike2 obj = new Honda3();
        System.out.println(obj.speedlimit);//90
        System.out.println(obj.getSpeedlimit());
    }
}