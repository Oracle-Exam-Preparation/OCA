package com.trl.string.stringBuilder.a2;

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
}

/*
What is the result of the following code?

7: StringBuilder sb = new StringBuilder();
8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
9: System.out.println(sb);

A. abbaaccc
B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An exception is thrown.
F. The code does not compile.

B. This example uses method chaining. After the call to append() , sb contains "aaa". That result is passed to the first
insert() call, which inserts at index 1. At this point sb contains abbbaa. That result is passed to the final insert(),
which inserts at index 4, resulting in abbaccca.
*/