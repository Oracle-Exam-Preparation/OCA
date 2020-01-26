package com.trl.class_.abstract_.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Main {

    public static void main(String[] args) {

        Test test = new Test();
        test.method_F();
        test.methodNotAbstract();

        System.out.println("===========================");
        Interface test_1 = new Test();
        test_1.method_F();

        System.out.println("===========================");
        Abstract_Class test_2 = new Test();
        test_2.method_F();
        test_2.methodNotAbstract();

    }

}
