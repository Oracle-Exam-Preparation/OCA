package com.trl.inheritance.a8;

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
Choose the correct statement about the following code:

1: interface HasExoskeleton {
2:     abstract int getNumberOfSections();
3: }
4: abstract class Insect implements HasExoskeleton {
5:     abstract int getNumberOfLegs();
6: }
7: public class Beetle extends Insect {
8:     int getNumberOfLegs() { return 6; }
9: }

A. It compiles and runs without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 4.
D. The code will not compile because of line 7.
E. It compiles but throws an exception at runtime.

D. The code fails to compile because Beetle, the first concrete subclass, doesn’t implement getNumberOfSections(), which
is inherited as an abstract method; therefore, option D is correct. Option B is incorrect because there is nothing wrong
with this interface method definition. Option C is incorrect because an abstract class is not required to implement any
abstract methods, including those inherited from an interface. Option E is incorrect because the code fails at compilation-time.
*/