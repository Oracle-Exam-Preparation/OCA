package com.trl.inheritance.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/9/19
 */
public class Test {
}

/*
Which statement(s) are correct about the following code? (Choose all that apply)

public class Rodent {
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}
public class Beaver extends Rodent {
    public Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}

A. It will compile without issue.
B. It fails to compile because the type of the exception the method throws is a subclass of the type of exception the
   parent method throws.
C. It fails to compile because the return types are not covariant.
D. It fails to compile because the method is protected in the parent class and public in the subclass.
E. It fails to compile because of a static modifier mismatch between the two methods.

C, E. The code doesn’t compile, so option A is incorrect. Option B is also not correct because the rules for overriding
a method allow a subclass to define a method with an exception that is a subclass of the exception in the parent method.
Option C is correct because the return types are not covariant; in particular, Number is not a subclass of Integer.
Option D is incorrect because the subclass defines a method that is more accessible than the method in the parent class,
which is allowed. Finally, option E is correct because the method is declared as static in the parent class and not so in the
child class. For nonprivate methods in the parent class, both methods must use static (hide) or neither should use
static (override).
*/