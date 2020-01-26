package com.trl.instanceof_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Test_3 {
    public static void main(String[] args) {
        System.out.println(new CC() instanceof IN);
        System.out.println(new CC() instanceof AC);
        System.out.println(new CC() instanceof AA);
        System.out.println(new CC() instanceof BB);
        System.out.println(new CC() instanceof CC);
    }
}

abstract class AC {
}

interface IN {
}

class AA extends AC {
}

class BB extends AA implements IN {
}

class CC extends BB implements IN {
}