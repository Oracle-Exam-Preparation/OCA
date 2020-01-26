package com.trl.garbageCollection.a1;

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
Suppose we have a class named Rabbit. Which of the following statements are true? (Choose all that apply)

1: public class Rabbit {
2:     public static void main(String[] args) {
3:         Rabbit one = new Rabbit();
4:         Rabbit two = new Rabbit();
5:         Rabbit three = one;
6:         one = null;
7:         Rabbit four = one;
8:         three = null;
9:         two = null;
10:        two = new Rabbit();
11:        System.gc();
12: } }

A. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6.
B. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8.
C. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12.
D. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9.
E. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11.
F. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12.

B, D. The Rabbit object from line 3 has two references to it: one and three . The references are nulled out on lines 6
and 8, respectively. Option B is correct because this makes the object eligible for garbage collection after line 8.
Line 7 sets the reference four to the now null one , which means it has no effect on garbage collection. The Rabbit
object from line 4 only has a single reference to it: two . Option D is correct because this single reference becomes
null on line 9. The Rabbit object declared on line 10 becomes eligible for garbage collection at the end of the method
on line 12. Calling System.gc() has no effect on eligibility for garbage collection.
*/