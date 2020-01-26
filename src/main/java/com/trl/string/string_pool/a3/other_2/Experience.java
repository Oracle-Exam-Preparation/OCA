package com.trl.string.string_pool.a3.other_2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";

        System.out.println("com.trl.string.string_pool.a3.other.Other.hello == hello  --> " + (com.trl.string.string_pool.a3.other_1.Other.hello == hello));    //line 1
        System.out.println("com.trl.string.string_pool.a3.other_.Other.hello == hello --> " + (com.trl.string.string_pool.a3.other_2.Other.hello == hello));   //line 2
        System.out.println("(hello == (\"Hel\"+\"lo\"))                       --> " + (hello == ("Hel" + "lo")));           //line 3
        System.out.println("(hello == (\"Hel\"+lo))                         --> " + (hello == ("Hel" + lo)));              //line 4
        System.out.println("hello == (\"Hel\"+lo).intern()                  --> " + (hello == ("Hel" + lo).intern()));          //line 5
    }
}