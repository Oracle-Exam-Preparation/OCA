package com.trl.method.paramethers.type_parameters_reference.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/9/19
 */
public class Experience {
    public static void main(String[] args) {
        Integer a = 15;
        Integer b = 10;
        A.addToInt(a, b);
        System.out.println(a);

        Integer c = new Integer(15);
        Integer d = new Integer(10);
        A.addToInt(c, d);
        System.out.println(c);
    }
}

class A {
    // Attencion aqui se esta haciendo autoboxing Integer to int y por eso aqui se pasa los parametros por value no por reference
    public static void addToInt(Integer x, Integer amountToAdd) {
        x = x + amountToAdd;
    }
}