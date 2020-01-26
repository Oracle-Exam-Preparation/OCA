package com.trl.inheritance.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/8/19
 */

public class Test {
    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}

class Baap {

    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }

}

class Beta extends Baap {

    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }
}
