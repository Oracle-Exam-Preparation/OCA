package com.trl.import_.a3;

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
Given the following classes, which of the following snippets can be inserted in place of INSERT IMPORTS HERE and have
the code compile? (Choose all that apply)

package aquarium;
public class Water {
    boolean salty = false;
}

package aquarium.jellies;
public class Water {
    boolean salty = true;
}

package employee;
INSERT IMPORTS HERE
public class WaterFiller {
    Water water;
}

A. import aquarium.*;
B. import aquarium.Water;
   import aquarium.jellies.*;
C. import aquarium.*;
   import aquarium.jellies.Water;
D. import aquarium.*;
   import aquarium.jellies.*;
E. import aquarium.Water;
   import aquarium.jellies.Water;
F. None of these imports can make the code compile.

A, B, C. Option A is correct because it imports all the classes in the aquarium package including aquarium.Water. Options
B and C are correct because they import Water by classname. Since importing by classname takes precedence over wildcards,
these compile. Option D is incorrect because Java doesn’t know which of the two wildcard Water classes to use. Option E
is incorrect because you cannot specify the same classname in two imports.
*/