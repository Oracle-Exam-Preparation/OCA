package com.trl.variable.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(A.value);

        // No salta error. Se permite llama static variable con objeto.
        System.out.println(new A().value);

        // Una situacion muy curiosa.
        // No va saltar exception --> NullPointException
        // Para llamar variable estatica no se necesita objeto, solo se necesita el tipo de enlace. Por el tipo de
        // enlace se llama la variable estatica.
        A ref = null;
        System.out.println(ref.value);
    }
}

class A {
    static String value = "A";
}