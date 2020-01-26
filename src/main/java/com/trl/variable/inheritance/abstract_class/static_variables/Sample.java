package com.trl.variable.inheritance.abstract_class.static_variables;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Sample extends AClass {
    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.thevalue;
        int l = thevalue;
        int k_1 = Sample.thevalue;
        int k = AClass.thevalue;
    }
}

abstract class AClass {
    static int thevalue = 0;
}