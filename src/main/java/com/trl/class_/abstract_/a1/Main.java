package com.trl.class_.abstract_.a1;

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
        test.methodAbstract();
        test.methodNotAbstract();

        System.out.println("=======================");
        Abstract_A test_1 = new Test();
        test_1.methodAbstract();
        test_1.methodNotAbstract();

        System.out.println("=======================");
        Abstract_A test_2 = new Test();
        test_2.methodAbstract();
        test_2.methodNotAbstract();

    }

}