package com.trl.string.string_pool.a1;

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
        String str_1 = "Hello";
        String str_2 = new String(str_1);

        System.out.println("Hello".equals(str_1));
        System.out.println(str_1 == str_2);
        System.out.println(str_1 == str_2.intern());
        System.out.println(str_2.equals(str_1));
        System.out.println("Hello" == str_1);
        System.out.println("Hello" == str_2);
        System.out.println("Hello" == str_2.intern());
    }
}

/*

Which of the following are output by this code? (Choose all that apply)

3: String s = "Hello";
4: String t = new String(s);
5: if ("Hello".equals(s)) System.out.println("one");
6: if (t == s) System.out.println("two");
7: if (t.equals(s)) System.out.println("three");
8: if ("Hello" == s) System.out.println("four");
9: if ("Hello" == t) System.out.println("five");

A. one
B. two
C. three
D. four
E. five
F. The code does not compile.

A, C, D. The code compiles fine. Line 3 points to the String in the string pool. Line 4 calls the String constructor
explicitly and is therefore a different object than s. Lines 5 and 7 check for object equality, which is true, and so
print one and three. Line 6 uses object reference equality, which is not true since we have different objects. Line 7 also
compares references but is true since both references point to the object from the string pool. Finally, line 8 compares
one object from the string pool with one that was explicitly constructed and returns false.
*/