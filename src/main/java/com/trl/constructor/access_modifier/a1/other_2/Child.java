package com.trl.constructor.access_modifier.a1.other_2;

import com.trl.constructor.access_modifier.a1.other_1.Parent;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 24/9/19
 */
public class Child extends Parent {

    // Compilation Error !!!  Constructor parenta tiene "access modifer package" y por esta rason no se
    // puede llegar al constructor sin parametros.
//    public Child(){ }

    public Child(String name){
        super(name);
    }
}