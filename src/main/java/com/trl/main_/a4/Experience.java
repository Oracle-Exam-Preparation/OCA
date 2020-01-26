package com.trl.main_.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */

public class Experience {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        Experience ex = new Experience();
        String[][] arg = {args};
        ex.main(arg);
    }
}

/*
The above program is compiled with the command line:
javac FunWithArgs.java

and then run with:
java FunWithArgs abc def ghi

What will be the output?
*/
