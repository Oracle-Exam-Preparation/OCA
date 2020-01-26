package com.trl.others;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class InterviewConstructor {
    public static void main(String[] args) throws InterruptedException {
//        Test_0 test_0 = new Test_0("Hello");
        Test_1 test_1 = new Test_1("Hello");
    }
}

/**
 * 1) Will not compile
 * 2) Output: Hello Hello
 * 3) Output: null Hello
 */
class Test_1 {
    private String msg;

    public Test_1(String msg) throws InterruptedException {
        String valueA = this.msg;

        Thread.sleep(1000);
        this.msg = msg;

        String valueB = this.msg;

        System.err.println(valueA);
        System.err.println(valueB);
    }
}

/**
 * 1) Will not compile
 * 2) Output: Hello Hello
 * 3) Output: null Hello
 */
class Test_0 {
    private String msg;

    public Test_0(String msg) throws InterruptedException {
        System.err.println(msg);
        Thread.sleep(1000);
        this.msg = msg;
        System.err.println(msg);
    }
}
