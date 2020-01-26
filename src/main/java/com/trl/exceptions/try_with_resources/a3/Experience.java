package com.trl.exceptions.try_with_resources.a3;

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
        try (A a = new A()){
            a.method();
        } catch (Exception e) {
            e.printStackTrace();
            // Compilation Exception !!! Al objeto "a" no se ve dentro de blocke "catch"
            // Objeto "a" solo se ve dentoro de blocke "try"
//            a.method();                                                                      // Compilation Exception !!!
        } finally {
            // Compilation Exception !!! Al objeto "a" no se ve dentro de blocke "finally"
            // Objeto "a" solo se ve dentoro de blocke "try"
//            a.method();                                                                      // Compilation Exception !!!
        }
    }
}

class A implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.err.println("A --> close()");
    }

    public void method() {

    }
}