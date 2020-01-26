package com.trl.others;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @link https://habr.com/ru/company/skillbox/blog/442048/
 * @since 13/07/19
 */
public class HowToSolveTypicalProblemsProgrammerGoogle {

    public static void main(String[] args) {


//        System.out.println(search_1(searchString, sourceString_6));

    }

    public static int search_A(String searchString, String sourceString) {
        char[] searchChars = searchString.toCharArray();
        char[] sourceChars = sourceString.toCharArray();

        for (int i = 0; i < sourceChars.length; i++) {
            if (i + 2 < sourceChars.length && sourceChars[i] == searchChars[0]) {
                if (sourceChars[i + 1] == searchChars[1]) {
                    if (sourceChars[i + 2] == searchChars[2]) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static int search_B(String searchString, String sourceString) {
        char[] sourceChars = sourceString.toCharArray();

        for (int i = 0; i < sourceChars.length; i++) {
            if (i + (searchString.length() - 1) < sourceChars.length && sourceChars[i] == searchString.charAt(0)) {
                if (searchString.equals(new String(new char[]{sourceChars[i], sourceChars[i + 1], sourceChars[i + 2]}))) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static int search_C(String searchString, String sourceString) {
        char[] sourceChars = sourceString.toCharArray();

        for (int i = 0; i < sourceChars.length; i++) {
            if (i + (searchString.length() - 1) < sourceChars.length && sourceChars[i] == searchString.charAt(0)) {
                if (searchString.equals(sourceString.substring(i, i + 3))) {
                    return i;
                }
            }
        }

        return -1;
    }
}
