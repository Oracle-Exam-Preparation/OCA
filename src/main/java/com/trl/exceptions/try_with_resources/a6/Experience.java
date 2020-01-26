package com.trl.exceptions.try_with_resources.a6;

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
    public static void main(String[] args) {
        try (A a = new A(); B b = new B(); C c = new C()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.err.println("A --> close()");
    }
}

class B implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.err.println("B --> close()");
    }
}

class C extends A {
    @Override
    public void close() throws Exception {
        System.err.println("C --> close()");
    }
}