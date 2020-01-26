package com.trl.method.paramethers.a4;

/**
 * This test is taken from the book:         OCA: Oracle ®
 *                                     Certified Associate Java ®
 *                                         SE 8 Programmer I
 *                                            Study Guide
 *                                            Exam 1Z0-808
 *
 * @link www.oreilly.com/library/view/oca-oracle-certified/9781118957424/
 */
public class Test {
    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(int x) {
        System.out.print("int");
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
//        t.print(6.789F);
    }
}

/*
What is the result of the following statements?

1: public class Test {
2:     public void print(byte x) {
3:         System.out.print("byte");
4:     }
5:     public void print(int x) {
6:         System.out.print("int");
7:     }
8:     public void print(float x) {
9:         System.out.print("float");
10:    }
11:    public void print(Object x) {
12:        System.out.print("Object");
13:    }
14:    public static void main(String[] args) {
15:        Test t = new Test();
16:        short s = 123;
17:        t.print(s);
18:        t.print(true);
19:        t.print(6.789);
20:    }
21: }

A. bytefloatObject
B. intfloatObject
C. byteObjectfloat
D. intObjectfloat
E. intObjectObject
F. byteObjectObject

E. The argument on line 17 is a short. It can be promoted to an int , so print() on line 5 is invoked. The argument on
line 18 is a boolean. It can be autoboxed to a boolean, so print() on line 11 is invoked. The argument on line 19 is a
double. It can be autoboxed to a double, so print() on line 11 is invoked. Therefore, the output is intObjectObject and
the correct answer is option E.
*/