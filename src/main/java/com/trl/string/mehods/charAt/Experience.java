package com.trl.string.mehods.charAt;

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
    public static void main(String[] args) {
        String source = "  Buried Treasure Chest! ";

        /* Returns the 'blank space' character from location 0 */
        char c1 = source.charAt(0);
        System.err.println("source.charAt(0) = " + c1);

        /* Returns the character 'B' from location 2 */
        char c2 = source.charAt(2);
        System.err.println("source.charAt(2) = " + c2);

        /* Returns the character '!' from location 23 */
        char c3 = source.charAt(23);
        System.err.println("source.charAt(23) = " + c3);

        /* Returns the 'blank space' character from location 24 */
        char c4 = source.charAt(24);
        System.err.println("source.charAt(24) = " + c4);

        /* Throws a StringIndexOutOfBoundsException exception*/
//        char c5 = source.charAt(25);
//        System.err.println("source.charAt(25) = " + c5);

        // StringIndexOutOfBoundsException: String index out of range: 101
//        char c6 = source.charAt('e');
//        System.err.println("source.charAt('e') = " + c6);
    }
}
