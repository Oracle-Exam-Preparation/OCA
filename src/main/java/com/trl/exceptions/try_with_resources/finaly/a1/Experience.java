package com.trl.exceptions.try_with_resources.finaly.a1;

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
//        try (A a = new A()){                                                 // Compilation Exception !!!
//        }

        try (A a = new A()) {
            try (A a_2 = new A()) { }                                          // Not Compilation Exception !!!
        } catch (Exception e) { }

        try (A a = new A()) {
            try (A a_2 = new A()) {
            } catch (Exception e) { }
        } catch (Exception e) { }

        try (A a = new A()) {
            try (A a_2 = new A()) {
                try (A a_3 = new A()){ }
            }
        } catch (Exception e) { }

//        try (A a = new A()){                                                 // Compilation Exception !!!
//        } finally { }

        try (A a = new A()) {                                                  // Not Compilation Exception !!!
        } catch (Exception e) { }

        try (A a = new A()) {                                                  // Not Compilation Exception !!!
        } catch (Exception e) {
        } finally { }
    }

}

class A implements AutoCloseable {
    @Override
    public void close() throws Exception {
    }
}