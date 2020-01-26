package com.trl.method.methods_overloading.a1.a1;

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
What is the output of the following code?

1: class Arthropod {
2:     public void printName(double input) { System.out.print("Arthropod"); }
3: }
4: public class Spider extends Arthropod {
5:     public void printName(int input) { System.out.print("Spider"); }
6:     public static void main(String[] args) {
7:         Spider spider = new Spider();
8:         spider.printName(4);
9:         spider.printName(9.0);
10:    }
11: }

A. SpiderArthropod
B. ArthropodSpider
C. SpiderSpider
D. ArthropodArthropod
E. The code will not compile because of line 5.
F. The code will not compile because of line 9.

A. The code compiles and runs without issue, so options E and F are incorrect. The printName() method is an overload
in Spider , not an override, so both methods may be called. The call on line 8 references the version that takes an int
as input defined in the Spider class, and the call on line 9 references the version in the Arthropod class that takes a
double. Therefore, SpiderArthropod is output and option A is the correct answer.
*/