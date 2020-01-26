package com.trl.undefined_tests.a1;

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
        short numPets = 5;                  // line 4
//        int numGrains = 5.6;              // line 5      COMPILATION ERROR
        String name = "Scruffy";            // line 6
//        numPets.length();                 // line 7      COMPILATION ERROR
//        numGrains.length();               // line 8      COMPILATION ERROR
        name.length();
    }
}

/*

Which of the following are true? (Choose all that apply)
4: short numPets = 5;
5: int numGrains = 5.6;
6: String name = "Scruffy";
7: numPets.length();
8: numGrains.length();
9: name.length();
A. Line 4 generates a compiler error.
B. Line 5 generates a compiler error.
C. Line 6 generates a compiler error.
D. Line 7 generates a compiler error.
E. Line 8 generates a compiler error.

B, D, E. Option A (line 4) compiles because short is an integral type. Option B (line 5 generates a compiler error because
int is an integral type, but 5.6 is a floating-point type. Option C (line 6) compiles because it is assigned a String.
Options D and E (lines 7 and 8) do not compile because short and int are primitives. Primitives do not allow methods to
be called on them. Option F (line 9) compiles because length() is defined on String.
*/