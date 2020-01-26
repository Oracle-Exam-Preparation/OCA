package com.trl.swich.continue_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/9/19
 */
public class Experience {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
//                continue;                                                                     // Compilation Error !!!
            case 'D':
            case 'F':
                System.out.print("not good");
        }
    }
}