package com.trl.exceptions.a23;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/9/19
 */
public class Test {
}

/*
Which of the following can be inserted in the blank to make the code compile? (Choose all that apply)

public static void main(String[] args) {
    try {
        System.out.println("work real hard");
    } catch (___________ e) {
    } catch (RuntimeException e) {}
}

A. Exception
B. IOException
C. IllegalArgumentException
D. RuntimeException
E. StackOverflowError
F. None of the above.

C, E. Option C is allowed because it is a more specific type than RuntimeException. Option E is allowed because it isn’t
in the same inheritance tree as RuntimeException. It’s not a good idea to catch either of these. Option B is not allowed
because the method called inside the try block doesn’t declare an IOException to be thrown. The compiler realizes that
IOException would be an unreachable catch block. Option D is not allowed because the same exception can’t be specified in
two different catch blocks. Finally, option A is not allowed because it’s more general than RuntimeException and would
make that block unreachable.
*/