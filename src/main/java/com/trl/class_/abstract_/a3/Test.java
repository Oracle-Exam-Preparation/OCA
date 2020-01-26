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
public class Test extends Abstract_Class implements Interface {

    @Override
    public void method_F() {
        System.out.println("Realization method 'method_F'");
    }

    @Override
    public void methodNotAbstract() {
        System.out.println("override method 'methodNotAbstract'");
    }

}
