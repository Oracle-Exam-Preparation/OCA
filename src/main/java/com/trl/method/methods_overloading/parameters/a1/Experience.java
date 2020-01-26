package com.trl.method.methods_overloading.parameters.a1;

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
        System.out.println("======================================================================================= A");
        System.out.println("======================== int");
        A.method(1);
        System.out.println("======================== Integer");
        A.method(new Integer(1));
        System.out.println();


        System.out.println("======================================================================================= B");
        System.out.println("======================== double double");
        B.method(1.0, 2.0);

        System.out.println("======================== float float");
        B.method(1.0F, 2.0F);

        System.out.println("======================== double float");
        B.method(1.0, 2.0F);

        System.out.println("======================== float double");
        B.method(1.0F, 2.0);

        System.out.println("======================== int int");
        B.method(1, 2);

        System.out.println("======================== long long");
        B.method(1L, 2L);
        System.out.println();

        System.out.println("======================================================================================= C");
        System.out.println("======================== int int");
        C.method(1, 2);
        System.out.println("======================== Integer Integer");
        C.method(new Integer(1), new Integer(2));

        System.out.println("======================== double double");
        C.method(1.0, 2.0);
        System.out.println("======================== Double Double");
        C.method(new Double(1), new Double(2));

        System.out.println("======================== long long");
        C.method(1L, 2L);
        System.out.println("======================== Long Long");
        C.method(new Long(1), new Long(2));
        System.out.println();

        System.out.println("======================================================================================= D");
        System.out.println("======================== int int");
        D.method(1, 2);
        System.out.println("======================== Integer Integer");
        D.method(new Integer(1), new Integer(2));

        System.out.println("======================== double double");
        D.method(1.0, 2.0);
        System.out.println("======================== Double Double");
        D.method(new Double(1), new Double(2));

        System.out.println("======================== long long");
        D.method(1L, 2L);
        System.out.println("======================== Long Long");
        D.method(new Long(1), new Long(2));
    }
}

class A {
    public static void method(int i) {
        System.out.println("method(int i)");
    }

    public static void method(Integer i) {
        System.out.println("method(Integer i)");
    }
}

class B {
    public static void method(double a, double b) {
        System.out.println("method(double a, double b)");
    }

    public static void method(float a, float b) {
        System.out.println("method(float a, float b)");
    }
}

class C {
    public static void method(int a, int b) {
        System.out.println("method(int a, int b)");
    }

    public static void method(Integer a, Integer b) {
        System.out.println("method(Integer a, Integer b)");
    }

    public static void method(double a, double b) {
        System.out.println("method(double a, double b)");
    }
}

class D {
    public static void method(Integer a, Integer b) {
        System.out.println("method(Integer a, Integer b)");
    }

    public static void method(double a, double b) {
        System.out.println("method(double a, double b)");
    }

    public static void method(float a, float b) {
        System.out.println("method(float a, float b)");
    }
}

class E {
    public static void method(int a) {
        System.out.println("method(int a)");
    }

    public static void method(int a, int b) {
        System.out.println("method(int a, int b)");
    }

    public static void method(Integer a) {
        System.out.println("method(Integer a)");
    }

    public static void method(Integer a, Integer b) {
        System.out.println("method(Integer a, Integer b)");
    }

    public static void method(float a) {
        System.out.println("method(float a)");
    }

    public static void method(float a, float b) {
        System.out.println("method(float a, float b)");
    }

    public static void method(Float a) {
        System.out.println("method(Float a)");
    }

    public static void method(Float a, Float b) {
        System.out.println("method(Float a, Float b)");
    }

    public static void method(double a) {
        System.out.println("method(double a)");
    }

    public static void method(double a, double b) {
        System.out.println("method(double a, double b)");
    }

    public static void method(Double a) {
        System.out.println("method(Double a)");
    }

    public static void method(Double a, Double b) {
        System.out.println("method(Double a, Double b)");
    }
}