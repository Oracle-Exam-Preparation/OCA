package com.trl.inheritance.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Test {
    public static void main(String[] args) {
        // Given the following two declarations, which of the options will compile?
        Parent parent = null;
        Child child = null;

        parent = (Child) child;
        parent = new Child();
//        child = new Parent();        // COMPILATION ERROR. Object de tipo Parent no se puede guardar en una enlace de tipo Child.
        child = (Child) parent;
//       child = parent;              // COMPILATION ERROR. Object de tipo Parent no se puede guardar en una enlace de tipo Child.
        ((Child) parent).doStuff();
    }
}

class Parent {
    public int getCode() {
        return 2;
    }
}

class Child extends Parent {
    public void doStuff() {
    }
}
