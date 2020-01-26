package com.trl.method.paramethers.a3;

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
    public static void main(String[] args) {
        Test test = new Test();
//        System.out.println(test.howMany());                                        // A   ERROR Compilation
        System.out.println(test.howMany(true));                                  // B    ATTENTION not occur COMPILATION ERROR. And not occur RunTime EXCEPTION. Return zero.
        System.out.println(test.howMany(true, true));                     // C
        System.out.println(test.howMany(true, true, true));               // D
//        System.out.println(test.howMany(true, {true}));                           // E   ERROR Compilation
//        System.out.println(test.howMany(true, {true, true}));                     // F   ERROR Compilation
        System.out.println(test.howMany(true, new boolean[2]));;                 // G
    }

    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

}

/*
Given the following method, which of the method calls return 2? (Choose all that apply)

public int howMany(boolean b, boolean... b2) {
    return b2.length;
}

A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true});
F. howMany(true, {true, true});
G. howMany(true, new boolean[2]);

D, G. Option D passes the initial parameter plus two more to turn into a vararg array of size 2. Option G passes the
initial parameter plus an array of size 2. Option A does not compile because it does not pass the initial parameter.
Options E and F do not compile because they do not declare an array properly. It should be new boolean[] {true}. Option
B creates a vararg array of size 0 and option C creates a vararg array of size 1.
*/