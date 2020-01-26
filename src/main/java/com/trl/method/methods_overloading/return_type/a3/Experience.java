package com.trl.method.methods_overloading.return_type.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 20/8/19
 */
public class Experience {
}

class A {
    public Father method(int a) {
        System.out.println("public Father method()");
        return new Father();
    }

    public Grandfather method (String s) {
        System.out.println("public Father method()");
        return new Father();
    }

    public Child method () {
        System.out.println("public Father method()");
        return new Child();
    }
}


class Grandfather {
}

class Father extends Grandfather {
}

class Child extends Father {
}