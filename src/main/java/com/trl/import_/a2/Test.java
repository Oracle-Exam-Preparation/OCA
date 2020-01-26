package com.trl.import_.a2;

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
Given the following classes, what is the maximum number of imports that can be removed and have the code still compile?

package aquarium;
public class Water { }

package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
    public void print(Water water) {
        System.out.println(water);
    }
}

A. 0
B. 1
C. 2
D. 3
E. 4
F. Does not compile.

E. The first two imports can be removed because java.lang is automatically imported. The second two imports can be removed
because Tank and Water are in the same package, making the correct answer E. If Tank and Water were in different packages,
one of these two imports could be removed. In that case, the answer would be option D.
*/