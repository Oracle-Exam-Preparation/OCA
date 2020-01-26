package com.trl.interface_.extends_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/9/19
 */
public class Experience {
}

//interface A extends Experience {}                                         // Compilation Exception !!!
//interface C implements Experience {}                                      // Compilation Exception !!!

interface A extends Parent {}                                               // Not Compilation Exception !!!
//interface C implements Parent {}                                            // Compilation Exception !!!

interface Parent { }