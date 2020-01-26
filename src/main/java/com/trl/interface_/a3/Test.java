package com.trl.interface_.a3;

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

1: public interface CanFly {
2:     void fly();
3: }
4: interface HasWings {
5:     public abstract Object getWindSpan();
6: }
7: abstract class Falcon implements CanFly, HasWings {
8: }

A. It compiles without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of lines 2 and 5.
F. The code will not compile because the class Falcon doesn’t implement the interface methods.

A. Although the definition of methods on lines 2 and 5 vary, both will be converted to public abstract by the compiler.
Line 4 is fine, because an interface can have public or default access. Finally, the class Falcon doesn’t need to
implement the interface methods because it is marked as abstract. Therefore, the code will compile without issue.
*/