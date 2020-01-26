package com.trl.garbageCollection.a2;

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
}

/*
What is true about the following code? (Choose all that apply)

public class Bear {
    protected void finalize() {
        System.out.println("Roar!");
    }
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear = null;
        System.gc();
    }
}

A. finalize() is guaranteed to be called.
B. finalize() might or might not be called
C. finalize() is guaranteed not to be called.
D. Garbage collection is guaranteed to run.
E. Garbage collection might or might not run.
F. Garbage collection is guaranteed not to run.
G. The code does not compile.

B, E. Calling System.gc() suggests that Java might wish to run the garbage collector. Java is free to ignore the request,
making option E correct. finalize() runs if an object attempts to be garbage collected, making option B correct.
*/