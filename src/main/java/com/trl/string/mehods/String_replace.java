package com.trl.string.mehods;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class String_replace {

    public static void main(String[] args) {

        /*
         * Two replace method declarations can be used:
         * public String replace(char oldChar, char newChar) {...}
         * public String replace(CharSequence target, CharSequence
         * replacement) {...}
         */

        String pirateMessage = "  Buried Treasure Chest! ";

        /* Returns the string with all characters 'B' replaced with 'J'. */
        String s1 = pirateMessage.replace('B', 'J'); // Juried Treasure Chest!
        System.err.println("pirateMessage.replace('B', 'J') = " + s1);

        // Returns the string with all blank characters ' ' replaced with 'X'.
        String s2 = pirateMessage.replace(' ', 'X'); // XXBuriedXTreasureXChest!X
        System.err.println("pirateMessage.replace(' ', 'X') = " + s2);

        // Returns the string with all strings 'Chest' replaced with 'Coins'.
        String s3 = pirateMessage.replace("Chest", "Coins"); // Buried Treasure Coins!
        System.err.println("pirateMessage.replace(\"Chest\", \"Coins\") = " + s3);

        /* Returns the string with all characters 't' replaced with '_'. */
        String s4 = pirateMessage.replace('t', '_'); // Buried Treasure Ches_!
        System.err.println("pirateMessage.replace('t', '_') = " + s4);

        /* Returns the string with all characters 'T' replaced with '_'. */
        String s5 = pirateMessage.replace('T', '_'); // Buried _reasure Chest!
        System.err.println("pirateMessage.replace('T', '_') = " + s5);

        /* Returns the string with all characters 'e' replaced with '_'. */
        String s6 = pirateMessage.replace('e', '_'); // Buried _reasure Chest!
        System.err.println("pirateMessage.replace('e', '_') = " + s6);

    }

}
