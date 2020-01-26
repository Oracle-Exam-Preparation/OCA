package com.trl.exceptions.try_with_resources.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/9/19
 */
public class Experience {
}

class A implements AutoCloseable {
    public static void main(String[] args) {

    }

    private String name;

    public A(String name) {
        this.name = name;
        System.err.println("A(String name)");
    }

    @Override
    public void close() throws Exception {
        System.err.println("A --> close()");
    }
}