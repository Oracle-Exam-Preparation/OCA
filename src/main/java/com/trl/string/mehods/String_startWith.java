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
public class String_startWith {
    public static void main(String[] args) {
        String source = "  Buried Treasure Chest! ";

        // Returns true as the referenced string starts with the compared string.
        boolean b1 = source.startsWith("  Buried Treasure"); // true
        System.out.println("source.startsWith(\" Buried Treasure\") = " + b1);

        // Returns false as the referenced string does not start with the compared string.
        boolean b2 = source.startsWith(" Discovered"); // false
        System.out.println("source.startsWith(\" Discovered\") = " + b2);

        // Returns false as the referenced string does not start with the compared string at location 8.
        boolean b3 = source.startsWith("Treasure", 8); // false
        System.out.println("source.startsWith(\"Treasure\", 8) = " + b3);

        // Returns true as the referenced string does start with the compared string at location 9.
        boolean b4 = source.startsWith("Treasure", 9); // true
        System.out.println("source.startsWith(\"Treasure\", 9) = " + b4);
    }
}
