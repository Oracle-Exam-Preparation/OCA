package com.trl.general.a2222222222222;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/9/19
 */
public class Test {
}

/*
Which of the following are true? (Choose all that apply)

A. Package private access is more lenient than protected access.
B. A public class that has private fields and package private methods is not visible to classes outside the package.
C. You can use access modifiers so only some of the classes in a package see a particular package private class.
D. You can use access modifiers to allow read access to all methods, but not any instance variables.
E. You can use access modifiers to restrict read access to all classes that begin with the word Test.

D. Option D is correct. This is the common implementation for encapsulation by setting all fields to be private and all
methods to be public. Option A is incorrect because protected access allows everything that package private access allows
and additionally allows subclasses access. Option B is incorrect because the class is public. This means that other classes
can see the class. However, they cannot call any of the methods or read any of the fields. It is essentially a useless class.
Option C is incorrect because package private access applies to the whole package. Option E is incorrect because Java
has no such capability.
*/