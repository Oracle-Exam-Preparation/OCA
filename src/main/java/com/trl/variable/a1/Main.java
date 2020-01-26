package com.trl.variable.a1;

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
        Parent p_p = new Parent();
        System.out.println(p_p.package_value_parent);
        System.out.println(p_p.protected_value_parent);
        System.out.println(p_p.public_value_parent);

        Parent p_c = new Child();
        System.out.println(p_c.package_value_parent);
        System.out.println(p_c.protected_value_parent);
        System.out.println(p_c.public_value_parent);

//        System.out.println(p_c.package_value_child);                                                          // ERROR
//        System.out.println(p_c.protected_value_child);                                                        // ERROR
//        System.out.println(p_c.public_value_child);                                                           // ERROR

//         Enlace "p_c" tiene tipo "Parent" y no se puede llegar a las variables de "Child"
//         Para poder llegar a las variable hace falta hacer casting.
        System.out.println(((Child) p_c).package_value_child);
        System.out.println(((Child) p_c).protected_value_child);
        System.out.println(((Child) p_c).public_value_child);
    }
}

class Parent {
    // Los campos que tienen accesor private son campos de "Parent".
    // El "Child" no puede llegar a los campos privados de su "Parent".
    private String private_value_parent = "private value parent";

    protected String protected_value_parent = "protected value parent";

    // Si "Child" va estar en un package diferente de package "Parent", tampoco no podra llegar al variable cual tiene accesor por defecto(package).
    String package_value_parent = "package value parent";

    public String public_value_parent = "public value parent";
}

class Child extends Parent {
    private String private_value_child = "private value child";
    protected String protected_value_child = "protected value child";
    String package_value_child = "package value child";
    public String public_value_child = "public value child";
}
