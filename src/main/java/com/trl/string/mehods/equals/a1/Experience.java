package com.trl.string.mehods.equals.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Experience {
    static String newStr_2 = null;

    public static void main(String[] args) {
        String msg1 = "WALK THE PLANK!";
        String msg2 = "WALK THE PLANK!";
        String msg3 = ("WALK THE PLANK!");
        String msg4 = new String("WALK THE PLANK!");

        System.out.println(msg1.equals(msg2));   // true
        System.out.println(msg1.equals(msg3));   // true
        System.out.println(msg1.equals(msg4));   // true
        System.out.println(msg2.equals(msg3));   // true
        System.out.println(msg3.equals(msg4));   // true

        // =============================================================================================================

        String source = "good";
        char[] sourceArray = {'g', 'o', 'o', 'd'};

        String result = null;
        for (char ch : sourceArray) {
            result = result + ch;
        }
        System.out.println((result == source) + " " + (result.equals(source)));
        System.out.println(result);

        for (char ch : sourceArray) {
            newStr_2 = newStr_2 + ch;
        }
        System.out.println((newStr_2 == source) + " " + (newStr_2.equals(source)));
        System.out.println(newStr_2);
    }
}
