package com.trl.operatorTernary.a1;

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
//        int x = 5;
//        int x = 2;
        int x = 8;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}

/*
What is the output of the following code?

1: public class TernaryTester {
2:   public static void main(String[] args) {
3:     int x = 5;
4:     System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
5:   }}

A. 5
B. 4
C. 10
D. 8
E. 7
F. The code will not compile because of line 4.

D. As you learned in the section “Ternary Operator,” although parentheses are not required, they do greatly increase
code readability, such as the following equivalent statement:
                        System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7)
We apply the outside ternary operator fi rst, as it is possible the inner ternary expression may never be evaluated.
Since (x>2) is true , this reduces the problem to:
                        System.out.println((x < 4) ? 10 : 8)
Since x is greater than 2 , the answer is 8 , or option D in this case.
*/