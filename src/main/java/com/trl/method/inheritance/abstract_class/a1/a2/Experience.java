package com.trl.method.inheritance.abstract_class.a1.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/9/19
 */
public class Experience {
}

abstract class Whale {
//    public abstract void dive() { };

    public static void main(String[] args) {
        Whale whale = new Orca();
//        whale.dive();
    }
}

class Orca extends Whale {
    public void dive(int depth) {
        System.out.println("Orca diving");
    }
}