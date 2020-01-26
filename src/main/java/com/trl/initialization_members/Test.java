package com.trl.initialization_members;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 6/8/19
 */
public class Test {
    public static void main(String args[]) {
        InitTest it = new InitTest();
    }
}


//    What will the following program print?
class InitTest {

    public InitTest() {
        s1 = sM1("1");
    }

    static String s1 = sM1("a");
    String s3 = sM1("2");

    {
        s1 = sM1("3");
    }

    static {
        s1 = sM1("b");
    }

    static String s2 = sM1("c");
    String s4 = sM1("4");

    private static String sM1(String s) {
        System.out.println(s);
        return s;
    }

}


