package com.trl.class_.class_nestedClass_nestedStaticClass_innerClass.nestedClass.innerClass.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/07/19
 */
public class TopLevelClass {   // Este tipo de clase se llama "Top Level Class".

    public void someMethod() {

        // Este tipo de clase se llama "Inner Class".
        // "Inner Class" se permite definir dentro de un methodo.
        class InnerClass {
        }

        // "Inner Class" cual esta definido dentro de un metodo, solo se permite "Access Modifier" de tipo package(default)
        class InnerClass_4 {
        }

        // ERROR. No se permite difinir "Inner Class" dentro de un methodo con "Access Modifier" private.
//        private class InnerClass_1 { }

        // ERROR. No se permite difinir "Inner Class" dentro de un methodo con "Access Modifier" protected.
//        protected class InnerClass_2 { }

//         ERROR. No se permite difinir "Inner Class" dentro de un methodo con "Access Modifier" public.
//        public class InnerClass_3 { }

        // "Inner class" dentro de un methodo no se permite difinir como una interface.
//        interface InnerClass_5 { }

        // "Inner class" se puede difinir dntro de un methodo como una clase "abstract".
        abstract class InnerClass_6 {
        }

        // "Inner class" dentro de un methodo no se permite difinir como una enum.
//        enum  InnerClass_7 { }

    }

}


// Este es otro classe de tipo "Top Level Class".
class TopLevelClass_Other {
}