package com.trl.variable.inheritance.static_.a1;

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
        System.out.println("\n======================================================================================= 1");
        Parent p_p = new Parent();
        System.out.println(Parent.public_static_value_parent);
        System.out.println(p_p.public_static_value_parent);

        System.out.println("\n======================================================================================= 2");
        Parent p_c = new Child();
        System.out.println(Parent.public_static_value_parent);
        // En este caso siempre se va llamar variable estatica de "Parent". Por la razon que el tipo de enlase es de tipo "Parent".
        // Llamadas de variables simpre se hacen por tipo de enlace. Llamadas al variable no se hacen por tipo de objeto como los methodos.
        // Las variables 'static' es variables de la clase. La variable static no es una variable de objeto.
        System.out.println(p_c.public_static_value_parent);

        // Enlace "p_2" es de tipo "Parent", con el tipo de enlace "Parent" no se puede llegar al vale 'static' de "Child".
//        System.out.println(p_c.public_static_value_child);   // ERROR

        // Para poder usar variable "public_static_value_child" es obligado crear una instancia de clase "Child",
        // o va ser mas correcto llamar esta variable como se debe llamar las variables estaticas con tipo de la clase
        // y con nombre de la variable estatica "Child.public_static_value_child".
        System.out.println(Child.public_static_value_child);
        // Las variables estaticas se hereden.
        System.out.println(Child.public_static_value_parent);

        System.out.println("\n======================================================================================= 3");
        Child c_1 = new Child();
        System.out.println(c_1.public_static_value_child);
        // Las variables estaticas se hereden.
        System.out.println(c_1.public_static_value_parent);
    }
}

class Parent {
    public static String public_static_value_parent = "public static value parent";
}

class Child extends Parent {
    public static String public_static_value_child = "public static value child";
}