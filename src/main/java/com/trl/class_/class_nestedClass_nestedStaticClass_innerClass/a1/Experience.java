package com.trl.class_.class_nestedClass_nestedStaticClass_innerClass.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/8/19
 */
public class Experience {
    public static void main(String args[]) {
        System.out.println(new A().new InnerA().get());
        System.out.println(new A().new InnerA().get_2());
    }
}

class A {
    String a = "x";
    static char b = 'x';
    String c = "x";

    class InnerA {
        String a = "y";

        String get() {
            String c = "temp";
            c = A.this.a;
            return c;
        }

        String get_2() {
            String c = "temp";
            c = this.a;
            return c;
        }
    }
}