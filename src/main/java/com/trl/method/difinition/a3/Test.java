package com.trl.method.difinition.a3;

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
    public void methodA() { return;}                   // A
//    public void methodB() { return null;}            // B     ERROR   Method void not allowed "return null"
    public void methodD() {}                           // C
//    public int methodD() { return 9;}                // D     ERROR    Misma "signature" de method, que tiene solucion "C"
//    public int methodE() { return 9.0;}              // E     ERROR    Return value is incorrect.
//    public int methodF() { return;}                  // F     ERROR    Return value is empty
//    public int methodG() { return null;}             // G     ERROR    Return value is incorrect
}

/*
Which of the following methods compile? (Choose all that apply)

A. public void methodA() { return;}
B. public void methodB() { return null;}
C. public void methodD() {}
D. public int methodD() { return 9;}
E. public int methodE() { return 9.0;}
F. public int methodF() { return;}
G. public int methodG() { return null;}

This test is ambiguous:
    If methods is allocated in the same class, answer is should be A, C.
    if methods is allocated in different class, answer is should be
            A, C, D. Options A and C are correct because a void method is allowed to have a return statement as long as
            it doesn’t try to return a value. Options B and G do not compile because null requires a reference object as
            the return type. void is not a reference object since it is a marker for no return type. int is not a reference
            object since it is a primitive. Option D is correct because it returns an int value. Option E does not compile
            because it tries to return a double when the return type is int . Since a double cannot be assigned to an int,
            it cannot be returned as one either. Option F does not compile because no value is actually returned.

 It all depends on, is the methods are located in the same "class" or located in different "class.
*/