package com.trl.casting.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 5/9/19
 */
public class Test {
    public static void main(String[] args) {
        byte a = 40, b = 50;
//        byte sum = (byte) a + b;              // ERROR
//        byte sum2 = ((byte) a + b);           // ERROR
        byte sum = (byte) (a + b);
        System.out.println(sum);
    }
}

/*
What is the output of the following code?

3: byte a = 40, b = 50;
4: byte sum = (byte) a + b;
5: System.out.println(sum);

D. Line 4 generates a possible loss of precision compiler error. The cast operator has the highest precedence, so it is
evaluated first, casting a to a byte. Then, the addition is evaluated, causing both a and b to be promoted to int values.
The value 90 is an int and cannot be assigned to the byte sum without an explicit cast, so the code does not compile. The
code could be corrected with parentheses around (a + b) , in which case option C would be the correct answer.
*/