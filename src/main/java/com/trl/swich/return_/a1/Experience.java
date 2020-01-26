package com.trl.swich.return_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/10/19
 */
public class Experience {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("great");
            case 'C':
                System.out.println("good");
                return;                                                 // Not Compilation Error !!! But exit from main method.
            case 'D':
            case 'F':
                System.out.println("not good");
        }

        System.out.println("Hello");;
    }
}
