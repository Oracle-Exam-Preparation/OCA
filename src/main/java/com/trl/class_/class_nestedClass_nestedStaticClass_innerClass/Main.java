package com.trl.class_.class_nestedClass_nestedStaticClass_innerClass;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 19/07/19
 */
public class Main {

    public static void main(String[] args) {

    }
}


class Test {

    public static void method() {

        class InnerClass {
            void someMethod() {

            }
        }

//        static class InnerClass_2 {    // ERROR, dentro de un mthodo no se permite definir un "inner clase" con palabra clase "static"
//            void someMethod() {
//
//            }
//        }
    }

    public void method_2() {

        class InnerClass {
            void someMethod() {

            }
        }

//        static class InnerClass_2 {    // ERROR, dentro de un mthodo no se permite definir un "inner clase" con palabra clase "static"
//            void someMethod() {
//
//            }
//        }
    }
}