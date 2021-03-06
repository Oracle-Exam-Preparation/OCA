package com.trl.method.inheritance.methods_overriding.interface_.a1.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/9/19
 */
public class Experience {
}

interface A_Default { public default String method() { return null; } }
interface B_Default { public default String method() { return null; } }

interface A_Static { public static String method() { return null; } }
interface B_Static { public static String method() { return null; } }

interface A_Abstract { String method(); }
interface B_Abstract { String method(); }

//interface D_D extends A_Default, B_Default {}                                // Compilation Exception !!!
interface S_S extends A_Static, B_Static {}                                    // Not Compilation Exception !!!
interface A_A extends A_Abstract, B_Abstract {}                                // Not Compilation Exception !!!

//interface D_A extends A_Default, B_Abstract {}                               // Compilation Exception !!!
interface D_S extends A_Default, B_Static {}                                   // Not Compilation Exception !!!

