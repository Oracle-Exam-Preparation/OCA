package com.trl.class_.class_nestedClass_nestedStaticClass_innerClass.nestedClass.innerClass.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/07/19
 */
public class TopLevelClass {


    // Muy interesante en esta situacion no hay error. Es solo para ensenar que compiller puede compilar esto sin dar error.
    // Pero no tengo ni idea donde se puede utilizar esta difinicion del methodo.
    public Object someMethod_1() {
        class InnerClass_1 {
        }
        return new InnerClass_1();
    }

    // Si definir methodo de esta manera, va salir ERROR.
    // Es que "Inner Class" cual esta definido dentor del methodo, su tiempo de vida es solo dentro de methodo.
    // Y fuera del method este "Inner Class" no existe. Y por esta rason, el tipo cual returna methodo no puede se
    // del tipo "Inner Class"
//    public InnerClass_2 someMethod_2() {
//        class InnerClass_2 { }
//        return new InnerClass_2();
//    }

}