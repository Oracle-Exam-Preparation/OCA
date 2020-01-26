package com.trl.method.inheritance.methods_overriding.interface_.a1.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/9/19
 */
public class Experience { }

interface A_Default { public default String method() { return null; } }
interface B_Default { public default String method() { return null; } }

interface A_Static { public static String method() { return null; } }
interface B_Static { public static String method() { return null; } }

interface A_Abstract { String method(); }
interface B_Abstract { String method(); }

//class D_D implements A_Default, B_Default {}                              // Compilation Exception !!!
class S_S implements A_Static, B_Static {}                                  // Not Compilation Exception !!!
//class A_A implements A_Abstract, B_Abstract {}                            // Compilation Exception !!!

//class D_A implements A_Default, B_Abstract {}                             // Compilation Exception !!!
class D_S implements A_Default, B_Static {}                                 // Not Compilation Exception !!!

