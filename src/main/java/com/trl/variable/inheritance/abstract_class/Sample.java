package com.trl.variable.inheritance.abstract_class;

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

    {
        int i = thevalue;
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.thevalue;
//        int l = thevalue;              // ERROR. No se permite usar variables no static dentro de un methdo static.
    }
}

abstract class AClass {
    int thevalue = 0;
}