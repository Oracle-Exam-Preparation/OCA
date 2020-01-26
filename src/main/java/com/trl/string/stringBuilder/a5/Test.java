package com.trl.string.stringBuilder.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/9/19
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println("reverse() --> " + puzzle);

        StringBuilder puzzle2 = new StringBuilder("Java");
        puzzle2.append("vaJ$").substring(0, 4);
        System.out.println("append(\"vaJ$\").substring(0, 4) --> " + puzzle2);

        StringBuilder puzzle3 = new StringBuilder("Java");
        puzzle3.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println("append(\"vaJ$\").delete(0, 3).deleteCharAt(puzzle.length() - 1) -->" + puzzle3);

        StringBuilder puzzle4 = new StringBuilder("Java");
        puzzle4.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
        System.out.println("append(\"vaJ$\").delete(0, 3).deleteCharAt(puzzle.length()) --> " + puzzle4);
    }
}

/*
Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)

3: StringBuilder puzzle = new StringBuilder("Java");
4: // INSERT CODE HERE
5: System.out.println(puzzle);

A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E. None of the above.

Answer C is incorrect, bat answer D is correct

A, C. The reverse() method is the easiest way of reversing the characters in a StringBuilder; therefore, option A is
correct. Option B is a nice distraction—it does in fact return "avaJ". However, substring() returns a String , which is
not stored anywhere. Option C uses method chaining. First it creates the value "JavavaJ$". Then it removes the first
three characters, resulting in "avaJ$" . Finally, it removes the last character, resulting in "avaJ". Option D throws
an exception because you cannot delete the character after the last index. Remember that deleteCharAt() uses indexes
that are zero based and length() counts starting with 1.
*/