package com.trl.equals.integer;

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

        Integer i = new Integer(1);

        Integer i2 = new Integer(1);
        int i3 = 1;
        Float f = new Float(1.0F);
        Long ln = new Long(1);
        Double d = new Double(1.0);

        System.out.println(i == i2);         // NOT ERROR
        System.out.println(i == i3);         // NOT ERROR
        System.out.println(i == 1);         // NOT ERROR
//        System.out.println(i == f);         // ERROR
//        System.out.println(i == ln);        // ERROR
//        System.out.println(i == d);         // ERROR

        System.out.println("==========================");
        System.out.println(i.equals(i2));
        System.out.println(i.equals(i3));
        System.out.println(i.equals(1));
        System.out.println(i.equals(f));
        System.out.println(i.equals(ln));
        System.out.println(i.equals(d));

    }
}
