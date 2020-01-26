package com.trl.swich.a2;

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
        // ====================================================================================================== String
        String value = "B";
        switch (value) {
            case "A":
                System.out.println("String --> " + "A");
                break;
            case "B":
                System.out.println("String --> " + "B");
                break;
        }

        // ========================================================================================================= int
        int value_1 = 1;
        switch (value_1) {
            case 1:
                System.out.println("int --> " + 1);
                break;
            case 2:
                System.out.println("int --> " + 2);
                break;
        }

        // ===================================================================================================== Integer
        Integer value_3 = new Integer(1);
        switch (value_3) {
            case 1:
                System.out.println("Integer --> " + 1);
                break;
            case 2:
                System.out.println("Integer --> " + 2);
                break;
        }

        // ======================================================================================================= short
        short value_8 = 1;
        switch (value_8) {
            case 1:
                System.out.println("short --> " + 1);
                break;
            case 2:
                System.out.println("short --> " + 2);
                break;
        }

        // ======================================================================================================= Short
        Short value_9 = new Short((short) 1);
        switch (value_9) {
            case 1:
                System.out.println("Short --> " + 1);
                break;
            case 2:
                System.out.println("Short --> " + 2);
                break;
        }

        // ======================================================================================================== char
        char value_10 = 'A';
        switch (value_10) {
            case 'A':
                System.out.println("char --> " + 'A');
                break;
            case 'B':
                System.out.println("char --> " + 'B');
                break;
        }

        // ======================================================================================================== Char
        Character value_11 = new Character('A');
        switch (value_11) {
            case 'A':
                System.out.println("Character --> " + 'A');
                break;
            case 'B':
                System.out.println("Character --> " + 'B');
                break;
        }

        // ======================================================================================================== char
        char value_12 = 'A';
        switch (value_10) {
            case 65:
                System.out.println("char --> " + 'A');
                break;
            case 66:
                System.out.println("char --> " + 'B');
                break;
        }

        // ======================================================================================================== byte
        byte value_15 = 1;
        switch (value_15) {
            case 1:
                System.out.println("byte --> " + 1);
                break;
            case 2:
                System.out.println("byte --> " + 2);
                break;
        }

        // ======================================================================================================== Byte
        Byte value_16 = new Byte((byte) 1);
        switch (value_16) {
            case 1:
                System.out.println("Byte --> " + 1);
                break;
            case 2:
                System.out.println("Byte --> " + 2);
                break;
        }

        // ======================================================================================================== enum
        Color value_17 = Color.WHITE;
        switch (value_17) {
            case RED:
                System.out.println("enum --> " + "RED");
                break;
            case BLACK:
                System.out.println("enum --> " + "BLACK");
                break;
            case WHITE:
                System.out.println("enum --> " + "WHITE");
                break;
        }

        // ======================================================================================================== long
        long value_13 = 1L;
//        switch (value_13) {                               // ERROR. not allowed parameter long
//            case 1L:
//                System.out.println(1L);
//                break;
//            case 2L:
//                System.out.println(2L);
//                break;
//        }

        // ======================================================================================================== Long
        Long value_14 = new Long(1L);
//        switch (value_14) {                               // ERROR. not allowed parameter Long
//            case 1L:
//                System.out.println(1L);
//                break;
//            case 2L:
//                System.out.println(2L);
//                break;
//        }

        // ====================================================================================================== double
        double value_4 = 2.8;
//        switch (value_4) {                       // ERROR. not allowed parameter double
//            case 2.8:
//                System.out.println(2.8);
//                break;
//            case 3.9:
//                System.out.println(3.9);
//                break;
//        }

        // ====================================================================================================== Double
        Double value_5 = new Double(2.8);
//        switch (value_5) {                       // ERROR. not allowed parameter Double
//            case 2.8:
//                System.out.println(2.8);
//                break;
//            case 3.9:
//                System.out.println(3.9);
//                break;
//        }

        // ======================================================================================================= float
        float value_6 = 2.8F;
//        switch (value_6) {                       // ERROR. not allowed parameter float
//            case 2.8F:
//                System.out.println(2.8F);
//                break;
//            case 3.9F:
//                System.out.println(3.9F);
//                break;
//    }

        // ======================================================================================================= float
        Float value_7 = new Float(2.8F);
//        switch (value_6) {                       // ERROR. not allowed parameter Float
//            case 2.8F:
//                System.out.println(2.8F);
//                break;
//            case 3.9F:
//                System.out.println(3.9F);
//                break;
//        }

        // ===================================================================================================== boolean
        boolean value_2 = true;
//        switch (value_2) {       // ERROR. not allowed parameter boolean
//            case true:
//                System.out.println(true);
//                break;
//            case false:
//                System.out.println(false);
//                break;
//        }
    }
}

enum Color {
    RED(), BLACK(), WHITE();
    Color() {
    }
}