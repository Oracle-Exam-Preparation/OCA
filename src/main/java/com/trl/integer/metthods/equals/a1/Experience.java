package com.trl.integer.metthods.equals.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println("i1 == i2 --> " + (i1 == i2));
        System.out.println("i1 == i3 --> " + (i1 == i3));                                               // Integer pull.
//        System.out.println("i1 == b1 --> " + (i1 == b1));                                     // Compilation Error !!!
//        System.out.println("i1 == b1 --> " + (i1 == g1));                                     // Compilation Error !!!
        System.out.println("i1.equal(i2) --> " + (i1.equals(i2)));
        System.out.println("i1.equal(i3) --> " + (i1.equals(i3)));
        System.out.println("i1.equal(g1) --> " + (i1.equals(g1)));
        System.out.println("i1.equal(b1) --> " + (i1.equals(b1)));
    }
}
