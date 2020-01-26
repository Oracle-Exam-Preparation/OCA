package com.trl.lambda.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
Which lambda can replace the MySecret class to return the same value? (Choose all that apply)

interface Secret {
    String magic(double d);
}

class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}

A. caller((e) -> "Poof");
B. caller((e) -> {"Poof"});
C. caller((e) -> { String e = ""; "Poof" });
D. caller((e) -> { String e = ""; return "Poof"; });
E. caller((e) -> { String e = ""; return "Poof" });
F. caller((e) -> { String f = ""; return "Poof"; });

A, F. Option B is incorrect because it does not use the return keyword. Options C, D, and E are incorrect because the
variable e is already in use from the lambda and cannot be redefined. Additionally, option C is missing the return
keyword and option E is missing the semicolon.
*/