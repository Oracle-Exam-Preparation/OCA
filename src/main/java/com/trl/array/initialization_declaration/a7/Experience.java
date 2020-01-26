package com.trl.array.initialization_declaration.a7;

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

    public void conversionLong() {
        byte b = 1;
        boolean boo = false;
        char c = 1;
        short s = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        l = b;
//        l = boo;            // not allowed
        l = c;
        l = s;
        l = i;
//        l = f;             // need cast
        l = (long) f;
//        l = d;             // need cast
        l = (long) d;
        l = l;
    }

    private void conversionDouble() {
        byte b = 1;
        boolean boo = false;
        char c = 1;
        short s = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        d = b;
//        d = boo;            // not allowed
        d = c;
        d = s;
        d = i;
        d = f;
        d = d;
        d = l;

    }

    private void conversionFloat() {
        byte b = 1;
        boolean boo = false;
        char c = 1;
        short s = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        f = b;
//        f = boo;        // not allowed
        f = c;
        f = s;
        f = i;
        f = f;
//        f = d;         // need cast
        f = (float) d;
        f = l;
        float f_2 = 34L;

    }

    private void conversionInt() {
        byte b = 1;
        boolean boo = false;
        char c = 1;
        short s = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        i = b;
//        f = boo;    // not allowed
        i = c;
        i = s;
        i = i;
//        i = f;      // need cast
        i = (int) f;
//        i = d;      // need cast
        i = (int) d;
//        i = l;      // need cast
        i = (int) l;
    }

    private void conversionChar() {
        byte b = 1;
        boolean boo = false;
        char c = 'A';
        short s = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

//        c = b;        // need cast
        c = (char) b;

//        c = boo;      // not allowed

        c = c;

//        c = s;        //  need cast
        c = (char) s;

//        c = i;        // need cast
        c = (char) i;

//        c = f;        // need cast
        c = (char) f;

//        c = d;        // need cast
        c = (char) d;

//        c = l;        // need cast
        c = (char) l;

    }

    private void conversionShort() {
        byte b = 1;
        boolean boo = false;
        short s = 1;
        char c = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        s = b;

//        s = boo;          // not allowed

        s = s;

//        s = c;            // need cast
        s = (short) c;

//        s = i;            // need cast
        s = (short) i;

//        s = f;            // need cast
        s = (short) f;
//        s = d;            // need cast
        s = (short) d;
//        s = l;            // need cast
        s = (short) l;

    }

    private void conversionByte() {
        byte b = 1;
        boolean boo = false;
        short s = 1;
        char c = 1;
        int i = 1;
        float f = 1.0F;
        double d = 1.0;
        long l = 1L;

        b = b;

//        b = boo;          // not allowed

//        b = s;            // need cast
        b = (byte) s;

//        b = c;            // need cast
        b = (byte) c;

//        b = i;            // need cast
        b = (byte) i;

//        b = f;            // need cast
        b = (byte) f;
//        b = d;            // need cast
        b = (byte) d;
//        b = l;            // need cast
        b = (byte) l;

    }
}
