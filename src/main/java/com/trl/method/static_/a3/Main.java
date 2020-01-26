package com.trl.method.static_.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Main {

    public static void main(String[] args) {
        send(new ChildMessage());
    }

    public static void send(ParentMessage msg) {
        msg.call();
    }

}

class ParentMessage {

    void call() {
        System.out.println("Parent");
    }

}

class ChildMessage extends ParentMessage {

    // ERROR
//    static void call() {
//        System.out.println("Child");
//    }

}
