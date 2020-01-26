package com.trl.method.inheritance.interface_.a1;

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
Which statements are true about the following code? (Choose all that apply)

1: interface HasVocalCords {
2:     public abstract void makeSound();
3: }
4: public interface CanBark extends HasVocalCords {
5:     public void bark();
6: }

A. The CanBark interface doesn’t compile.
B. A class that implements HasVocalCords must override the makeSound() method.
C. A class that implements CanBark inherits both the makeSound() and bark() methods.
D. A class that implements CanBark only inherits the bark() method.
E. An interface cannot extend another interface.

C. The code compiles without issue, so option A is wrong. Option B is incorrect, since an abstract class could implement
HasVocalCords without the need to override the makeSound() method. Option C is correct; any class that implements CanBark
automatically inherits its methods, as well as any inherited methods defined in the parent interface. Because option C is
correct, it follows that option D is incorrect. Finally, an interface can extend multiple interfaces, so option E is
incorrect.
*/