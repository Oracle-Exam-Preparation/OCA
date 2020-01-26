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
public class String_endWith {

    public static void main(String[] args) {

        String pirateMessage = "  Buried Treasure Chest! ";

        // Returns true as the referenced string ends with the compared string.
        boolean e1 = pirateMessage.endsWith("Treasure Chest! "); // true

        // Returns false as the referenced string does not end with the compared string.
        boolean e2 = pirateMessage.endsWith("Treasure Chest "); // false

    }

}
