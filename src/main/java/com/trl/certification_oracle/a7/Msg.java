package com.trl.certification_oracle.a7;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Msg {

    public static String doMsg(char x) {
        return "Good Day!";
    }

    public static String doMsg(int y) {
        return "Good Lack!";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
//        int z = '9';
//        int z = '10';   // ERROR
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }

}
