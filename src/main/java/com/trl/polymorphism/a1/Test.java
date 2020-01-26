package com.trl.polymorphism.a1;

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
Which of the following statements about polymorphism are true? (Choose all that apply)

A. A reference to an object may be cast to a subclass of the object without an explicit cast.
B. If a method takes a superclass of three objects, then any of those classes may be passed as a parameter to the method.
C. A method that takes a parameter with type java.lang.Object will take any reference.
D. All cast exceptions can be detected at compile-time.
E. By defining a public instance method in the superclass, you guarantee that the specific method will be called in the
   parent class at runtime.

B, C. A reference to an object requires an explicit cast if referenced with a subclass, so option A is incorrect. If the
cast is to a superclass reference, then an explicit cast is not required. Because of polymorphic parameters, if a method
takes the superclass of an object as a parameter, then any subclass references may be used without a cast, so option B is
correct. All objects extend java.lang.Object , so if a method takes that type, any valid object, including null , may be
passed; therefore, option C is correct. Some cast exceptions can be detected as errors at compile-time, but others can
only be detected at runtime, so D is incorrect. Due to the nature of polymorphism, a public instance method can be
overridden in a subclass and calls to it will be replaced even in the superclass it was defined, so E is incorrect.
*/