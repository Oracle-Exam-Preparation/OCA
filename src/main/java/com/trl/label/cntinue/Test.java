package com.trl.label.cntinue;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Test {
    public static void main(String[] args) {
        Test.crazyLoop();
    }

    static void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
            if (c > 3) continue JACK;      // Se atasca aqui la app loop infinito o hasta que no salte algun Exceprion o Error
            else c++;
        }
    }
}
