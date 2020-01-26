package com.trl.initialization_members.a7;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/9/19
 */
public class Test {
    public static void main(String[] args) {
//        int amount1 = 9L;                   // ERROR
        int amount2 = 0b101;
        int amount3 = 0xE;
        double amount4 = 0xE;
//        double amount5 = 1_2_.0_0;         // ERROR
//        int amount6 = 1_2_;                // ERROR
//        int amount7 = 08;                  // ERROR. octal number
        int amount8 = 07;                    // NOT ERROR. octal number
    }
}

/*

Given the following class, which of the following lines of code can replace INSERT CODE HERE to make the code compile?
(Choose all that apply)

public class Price {
    public void admission() {
        INSERT CODE HERE
        System.out.println(amount);
    }
}

A. int amount = 9L;
B. int amount = 0b101;
C. int amount = 0xE;
D. double amount = 0xE;
E. double amount = 1_2_.0_0;
F. int amount = 1_2_;
G. None of the above.

B, C, D. 0b is the prefix for a binary value and is correct. 0x is the prefix for a hexadecimal value. This value can be
assigned to many primitive types, including int and double , making options C and D correct. Option A is incorrect
because 9L is a long value. long amount = 9L would be allowed. Option E is incorrect because the underscore is immediately
before the decimal. Option F is incorrect because the underscore is the very last character.
*/