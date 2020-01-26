package com.trl.string.mehods.indexOf.a1;

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
        String str = "  Buried Treasure Chest! ";

        // Returns the integer 3 as it is the first 'u' in the string.
        int i1 = str.indexOf('u');                                                                                  // 3
        System.out.println(i1);

        // Returns the integer 14 as it is the first 'u' in the string past location 9.
        int i2 = str.indexOf('u', 9);                                                               // 14
        System.out.println(i2);

        // Returns the integer 13 as it starts at location 13 in the string.
        int i3 = str.indexOf("sure");                                                                              // 13
        System.out.println(i3);

        // Returns the integer -1 as there is no Treasure string on or past location 10
        int i4 = str.indexOf("Treasure", 10);                                                     // -1!
        System.out.println(i4);

        int i5 = str.indexOf("u", 1000);                                                          // -1!
        System.out.println(i5);

        int i6 = str.indexOf('z');
        System.out.println(i6);
    }
}
