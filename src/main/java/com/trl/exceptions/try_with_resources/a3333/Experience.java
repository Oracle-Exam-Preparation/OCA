package com.trl.exceptions.try_with_resources.a3333;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Experience {
    public static void main(String[] args) {
//        test_9();
//        test_10();
//        test_11();
//        test_14();
//        test_15();
//        test_16();
        test_17();
    }

    public static void test_17() {
        try (FailClose okClose_0 = new FailClose("Message failClose_0")) {
            System.err.println(0);
            try (FailClose okClose_1 = new FailClose("Message failClose_1")) {
                System.err.println(1);
                // NOP
            }
            System.err.println(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println(2);
    }

    public static void test_16() {
        try (OkClose okClose_0 = new OkClose("Message okClose_0"); OkClose okClose_1 = new OkClose("Message okClose_1")) {
            System.err.println(0);
            if (true) throw new Error();
            System.err.println(1);
        } catch (Exception e) {
            System.err.println(2);
            e.printStackTrace();
        }
        System.err.println(3);
    }

    public static void test_15() {
        try (OkClose okClose_0 = new OkClose("Mensage okClose_0"); OkClose okClose_1 = new OkClose("Message okClose_1")) {
            System.err.println(0);
            if (true) throw new Exception();
            System.err.println(1);
        } catch (Exception e) {
            System.err.println(2);
            e.printStackTrace();
        }
        System.err.println(3);
    }

    /**
     * 1) Will not compile
     * 2) Output: Exception
     * 3) Output: 0 1 2
     * 4) Output: Error 0
     * 5) Output: NotAutoCloseable cannot be converted to java.lang.AutoCloseable
     * 6) Output: 1
     * 7) Output: 2
     * 8) Output: Exception 0
     */
    public static void test_14() {
        // The lines below should not be commented out
//        try (OkClose okClose = new OkClose("Mensage"); NotAutoCloseable n = new NotAutoCloseable("Hello")){
//            System.err.println(0);
//            throw new RuntimeException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.err.println(2);
    }

    /**
     * 1) Will not compile
     * 2) Output: Message ok_A   Close OkClose        0       1
     * 3) Output: 0 1
     * 4) Output: Message
     * 5) Output: 0
     * 6) Output: 1
     * 7) Output: Message ok_A   Close OkClose    Close OkClose    1
     */
    public static void test_11() {
        OkClose okClose_A = new OkClose("Message okClose_A \n");
        // The lines below should not be commented out
        try (OkClose okClose_B = okClose_A) {
            System.err.println(okClose_B.getMsg());
        } catch (Exception e) {
            System.err.println(0);
        } finally {
            try {
                okClose_A.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.println(1);
        }
    }

    /**
     * 1) Will not compile
     * 2) Output: Message ok_A   Close OkClose  0   1
     * 3) Output: 0 1
     * 4) Output: Message
     * 5) Output: 0
     * 6) Output: 1
     * 7) Output: Message ok_A   Close OkClose    1
     */
    public static void test_10() {
        OkClose okClose_A = new OkClose("Message okClose_A \n");
        // The lines below should not be commented out
        try (OkClose okClose_B = okClose_A) {
            System.err.println(okClose_B.getMsg());
        } catch (Exception e) {
            System.err.println(0);
            try {
                okClose_A.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            System.err.println(1);
        }
    }

    /**
     * 1) Will not compile
     * 2) Output: Message 0 1
     * 3) Output: 0 1
     * 4) Output: Message
     * 5) Output: 0
     * 6) Output: 1
     */
    public static void test_9() {
        OkClose okClose;
        // The lines below should not be commented out
//        try (okClose = new OkClose("Message")) {
//            System.err.println(okClose.getMsg());
//        } catch (Exception e) {
//            System.err.println(0);
//        }finally {
//            System.err.println(1);
//        }
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
