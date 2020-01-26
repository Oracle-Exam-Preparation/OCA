package com.trl.constructor.inheritance.a1.b;

import com.trl.constructor.inheritance.a1.a.A;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/8/19
 */
public class B extends A {
    //    B(){ }                                                                       // ERROR. Constructor parent have private access
//    B(String name){ super(name); }                                               // ERROR. Constructor parent have package access
    B(String name, String name2) {
        super(name, name2);
    }                            // NOT ERROR. Constructor parent have protected access

    B(String name, String name2, String name3) {
        super(name, name2, name3);
    }       // NOT ERROR. Constructor parent have public access
}