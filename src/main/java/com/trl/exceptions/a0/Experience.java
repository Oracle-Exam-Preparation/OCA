package com.trl.exceptions.a0;

import java.io.IOException;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/9/19
 */
public class Experience {
    public static void main(String[] args) {
//        test_0();
//        test_2();
//        System.err.println(test_3());
        System.err.println(test_4());
//        System.err.println(test_5());
//        test_6();
//        test_7();
//        test_8();
//        test_12();
//        test_13();
    }

    /**
     * 1) Will not compile
     * 2) Output: RuntimeException
     * 3) Output: 0 1 2
     * 4) Output: Error 0
     * 5) Output: 0
     * 6) Output: 1
     * 7) Output: 2
     * 8) Output: RuntimeException 0
     * 9) Output: Error
     */
    public static void test_13() {
        try {
            System.err.println(0);
            throw new RuntimeException();
        } catch (Error error) {
            System.err.println(1);
        }
        System.err.println(2);
    }

    /**
     * 1) Will not compile
     * 2) Output: Error
     * 3) Output: 0 1
     * 4) Output: Error 0
     * 5) Output: 0
     * 6) Output: 1
     * 7) Output: RuntimeException 0
     * 8) Output: RuntimeException
     */
    public static void test_12() {
        try {
            throw new RuntimeException();
        } catch (Error error) {
            System.err.println(0);
        }
        System.err.println(1);
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1 2
     * 3) Output: 0 1 2 Error
     * 4) Output: 0 Error
     * 5) Output: 1 Error
     * 6) Output: Error
     * 7) Output: 0 1
     * 8) Output: 1 0
     * 9) Output: 1
     * 10) Output: 0
     * 11) Output: 1 2 Error
     * 12) Unreachable statement
     */
    public static int test_8() {
        try {
            throw new Error();
        } catch (Error e) {
            System.err.println(0);
            return 1;
        } finally {
            System.err.println(1);
        }
        // The line "System.err.println(2);" below should not be commented out
//        System.err.println(2);
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1
     * 3) Output: 0 1  Error
     * 4) Output: 0 Error
     * 5) Output: 1 Error
     * 6) Output: Error
     * 7) Output: 0 1
     * 8) Output: 1 0
     * 9) Output: 1
     * 10) Output: 0
     * 11) Output: 1 Error
     * 12) Unreachable statement
     */
    public static int test_7() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.err.println(0);
            return 1;
        } finally {
            System.err.println(1);
        }
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1
     * 3) Output: 0 1 Error
     * 4) Output: 0 Error
     * 5) Output: 1 Error
     * 6) Output: Error
     * 7) Output: 0 1
     * 8) Output: 1 0
     * 9) Output: 1
     * 10) Output: 0
     */
    public static int test_6() {
        try {
            throw new Error();
        } finally {
            System.err.println(0);
            return 1;
        }
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1 2 3
     * 3) Output: 0 1 2 Error
     * 4) Output: 0 1 2 3 Error
     * 5) Output: 0 Error
     * 6) Output: 1 Error
     * 7) Output: 2 Error
     * 8) Output: 3 Error
     * 9) Output: 1 3 Error
     */
    public static int test_5() {
        try {
            if (true) {
                throw new Error();
            }
        } catch (Throwable e) {
            System.err.println(0);
        } finally {
            System.err.println(1);
        }
        System.err.println(2);
        return 3;
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1 2
     * 3) Output: 0 1 Error
     * 4) Output: 0 1 2 Error
     * 5) Output: 0 Error
     * 6) Output: 1 Error
     * 7) Output: 2 Error
     */
    public static int test_4() {
        try {
            if (true) {
                throw new Error();
            }
        } finally {
            System.err.println(0);
        }
        System.err.println(1);
        return 2;
    }

    /**
     * 1) Will not compile
     * 2) Output: Error 0 1 2
     * 3) Output: 0 1 Error
     * 4) Output: 0 1 2 Error
     * 5) Output: 0 Error
     * 6) Output: 1 Error
     * 7) Unreachable statement
     */
    public static int test_3() {
        try {
            throw new Error();
        } finally {
            System.err.println(0);
            return 1;
        }
        // The lines "System.err.println(1); and return 2;" below should not be commented out
//        System.err.println(1);
//        return 2;
    }

    /**
     * 1) Will not compile
     * 2) Output: Error
     * 3) Output: Throwable
     * 4) Output: IOException
     */
    public static void test_2() {
        int value = (int) (Math.random() * 100);
        System.err.println(value);
        try {
            if (value % 2 == 0) {
                throw new Error();
            } else {
                throw new IOException();
            }
        } catch (Throwable e) {
            try {
                throw e;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * 1) Will not compile
     * 2) Output: Error
     * 3) Output: Throwable
     */
    public static void test_0() {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw e;
        }
    }
}

class OkClose implements AutoCloseable {
    private String msg;

    public OkClose(String msg) {
        this.msg = msg;
        System.err.println("new:OkClose(" + this.msg + ")");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close() for " + this.toString());
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "OkClose{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

class FailClose implements AutoCloseable {
    private String msg;

    public FailClose(String msg) {
        this.msg = msg;
        System.err.println("new:failClose(" + this.msg + ")");
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public void close() throws Exception {
        throw new Error("fail close() for " + this.toString());
    }

    @Override
    public String toString() {
        return "FailClose{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

class NotAutoCloseable {
    private String msg;

    public NotAutoCloseable(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
