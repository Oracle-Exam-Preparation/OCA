package com.trl.long_.initializatino.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/9/19
 */
public class Experience {
    public static void main(String[] args) {
        long a_1 = 1L;
        long a_2 = new Long("1");
        Long a_3 = new Long("1");
        Long a_4 = 1L;

        long b_1 = 1;
        long b_2 = new Integer("1");
//        Long b_3 = new Integer("1");                                           // Compilation Error !!!
        Long b_4 = new Integer("1").longValue();                             // Not Compilation Error !!!

        long c_1 = new Short("1");
//        Long c_2 = new Short("1");                                            // Compilation Error !!!
        Long c_2 = new Short("1").longValue();                               // Not Compilation Error !!!

        long d_1 = new Character('a');
//        Long d_2 = new Character('a');                                         // Compilation Error !!!
//        Long d_2 = new Character('a').longValue();                            // Compilation Error !!! Not exist method.

        long e_1 = new Byte("1");
//        Long e_2 = new Byte("1");                                              // Compilation Error !!!
        Long e_2 = new Byte("1").longValue();                                // Not Compilation Error !!!

//        long f_1 = 2.0;
//        long f_2 = new Double("1");                                           // Compilation Error !!!
//        Long f_3 = new Double("1");                                           // Compilation Error !!!
        Long f_4 = new Double("1").longValue();                              // Not Compilation Error !!!

//        long h_1 = 2.0F;
//        long h_2 = new Float("1.0");
//        Long h_3 = new Float("1.0");
        Long h_3 = new Float("1.0").longValue();                              // Not Compilation Error !!!
    }
}
