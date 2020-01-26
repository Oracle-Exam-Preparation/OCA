package com.trl.equals.long_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 9/8/19
 */
public class Test {
    public static void main(String[] args) {

        Long ln = new Long(1);

        Long ln2 = new Long(1);
        long ln3 = 1L;
        Integer i = new Integer(1);
        Float f = new Float(1.0F);
        Double d = new Double(1.0);

        System.out.println(ln == ln2);            // NOT ERROR.
        System.out.println(ln == ln3);            // NOT ERROR.
        System.out.println(ln == 1L);             // NOT ERROR.
//        System.out.println(ln == i);            // ERROR.
//        System.out.println(ln == f);            // ERROR.
//        System.out.println(ln == d);            // ERROR.

        System.out.println("================");
        System.out.println(ln.equals(ln2));
        System.out.println(ln.equals(ln3));
        System.out.println(ln.equals(1L));
        System.out.println(ln.equals(i));
        System.out.println(ln.equals(f));
        System.out.println(ln.equals(d));

    }
}
