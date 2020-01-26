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
public class String_equalsIsIgnoreCase {

    public static void main(String[] args) {

        String pirateMessage = "  Buried Treasure Chest! ";

        // Compares " Buried Treasure Chest! " with " Buried TREASURE Chest! "
        Boolean b1 = pirateMessage.equalsIgnoreCase("  Buried TREASURE Chest! "); // true
        System.out.println("pirateMessage.equalsIgnoreCase(\"  Buried TREASURE Chest! \") = " + b1);

        // Compares " Buried Treasure Chest! " with " Buried XXXXXXX Chest! "
        Boolean b2 = pirateMessage.equalsIgnoreCase("  Buried XXXXXXX Chest! "); // false
        System.out.println("pirateMessage.equalsIgnoreCase(\"  Buried XXXXXXX Chest! \") = " + b2);

    }

}
