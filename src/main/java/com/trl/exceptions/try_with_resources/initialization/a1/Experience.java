package com.trl.exceptions.try_with_resources.initialization.a1;

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
        try (A a_1 = new A("a_1")){                                             // Not Compilation Exception !!!
        } catch (Exception e) { }

        A a_2 = new A("a_2");
//        try (a_2){                                                                  // Compilation Exception !!!
//        } catch (Exception e){ }

        A a_3 = null;
//        try (a_3 = new A("a_3)){                                                    // Compilation Exception !!!
//        } catch (Exception e){ }

        A a_4 = new A("a_4");
        try (A a_44 = a_4){                                                           // Not Compilation Exception !!!
        } catch (Exception e) { }

        // ATTENTION Not RuntimeException !!! No sale "NullPointException", y tambien no se llama methodo "close()"
        A a_5 = null;
        try (A a_55 = a_5){                                                           // Not Compilation Exception !!!
        } catch (Exception e) { }
    }
}

class A implements AutoCloseable {
    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.err.println("A --> close() --> " + name);
    }
}