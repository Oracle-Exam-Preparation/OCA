package com.trl.class_.access_modifier;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/07/19
 */
public class A {

}

// ERROR. Un file solo puede tener una clase publica.
//public class B{}

// ERROR. Una clase de tipo "Top level" no puede tener "access modifier" de tipo "private"
//private class C { }

// ERROR. Una clase de tipo "Top level" no puede tener "access modifier" de tipo "protected"
//protected class C { }

// NOT ERROR. Se permite definir varias clases dentro de un fichero con "access modifier" package(o se puede desir de otra manera
// "access modifier" por defecto).
class C {
}

class D {
}
