package com.trl.method.methods_overloading.parameters.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println("=================== byte");
        byte b_1 = 1;
        A.action(b_1, b_1);
        B.action(b_1, b_1);

        System.out.println("=================== Byte");
        Byte b_2 = new Byte("1");
        A.action(b_2, b_2);
        B.action(b_2, b_2);

        System.out.println("=================== byte Byte");
//        A.action(b_1, b_2);                     // Compilation Exception !!! Ambiguous method call.
//        B.action(b_1, b_2);                     // Compilation Exception !!! Ambiguous method call.
//
        System.out.println("=================== Byte byte");
//        A.action(b_2, b_1);                     // Compilation Exception !!! Ambiguous method call.
//        B.action(b_2, b_1);                     // Compilation Exception !!! Ambiguous method call.
    }
}

class A {
    // priority low. Esli est peregryzenue methodu to vararg sridinix vsehda imeet samui niskii prioritet vipolnenia
    public static void action(byte... bytes) {
        System.out.println("public static void action(byte... bytes)");
    }

    // priority middle. Unboxing imeet menwei prioritet chem rozwerenie do bolie wirokoho tipa.
    public static void action(Byte b, Byte b2) {
        System.out.println("public static void action(Byte b, Byte b2)");
    }

    // priority high. Rozwerenie do bolie wirokoho tipa imeet bolwui prioritet chem unboxing
    public static void action(long lo, short sh) {
        System.out.println("public static void action(long lo, short sh)");
    }
}

class B {
    // priority low. Esli est peregryzenue methodu to vararg sridinix vsehda imeet samui niskii prioritet vipolnenia
    public static void action(byte... bytes) {
        System.out.println("public static void action(byte... bytes)");
    }

    // priority middle. Unboxing imeet menwei prioritet chem rozwerenie do bolie wirokoho tipa.
    public static void action(Byte b, Byte b2) {
        System.out.println("public static void action(Byte b, Byte b2)");
    }

    public static void action(byte b, byte b2) {
        System.out.println("public static void action(byte b, byte b2)");
    }

    // priority high. Rozwerenie do bolie wirokoho tipa imeet bolwui prioritet chem unboxing
    public static void action(long lo, short sh) {
        System.out.println("public static void action(long lo, short sh)");
    }
}
