package com.trl.string.mehods.concat.a1;

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
        String source = "ABC";
        String result = source.concat(" DE");
        System.out.println(result);

        // =============================================================================================================
        String abc = "";
        abc.concat("abc");
        abc.concat("def");
        System.out.print("|");
        System.out.print(abc);
        System.out.println("|");

        // =============================================================================================================
        String abc_2 = "";
        abc_2 = abc_2.concat("abc");
        abc_2 = abc_2.concat("def");
        System.out.print("|");
        System.out.print(abc_2);
        System.out.println("|");

        String abc_3 = null;
//        abc_3 = abc_3.concat("abc");                                    // Runtime Exception !!! NullPointerException.
//        abc_3 = abc_3.concat("def");
//        System.out.print("|");
//        System.out.print(abc_3);
//        System.out.println("|");

        String abc_4 = null;
        abc_4 = abc_4 + "abc";                                          // Not Runtime Exception !!! Output: "nullabcdef"
        abc_4 = abc_4 + "def";
        System.out.print("|");
        System.out.print(abc_4);
        System.out.println("|");

        String abc_5 = " ";
        abc_5 = abc_5.concat(" ");
        abc_5 = abc_5.concat(" ");
        System.out.print("|");
        System.out.print(abc_5);
        System.out.println("|");
    }
}
