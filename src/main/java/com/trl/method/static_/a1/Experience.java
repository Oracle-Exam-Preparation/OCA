package com.trl.method.static_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(A.value());

        // No salta error. Se permite llama static methods con objeto.
        System.out.println(new A().value());

        // Una situacion muy curiosa.
        // No va saltar exception --> NullPointException
        // Para hacer llamada al "method static" no hace falta objeto. Compilado cuando esta compilando este codigo
        // se fija al tipo de enlace no al objeto.
        A ref = null;
        System.out.println(ref.value());
    }
}

class A {
    static String value() {
        return "str";
    }
}
