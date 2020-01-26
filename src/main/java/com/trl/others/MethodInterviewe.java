package com.trl.others;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class MethodInterviewe {
    /*Какой из предложенных ниже методов не вызовет ошибку компиляции? */
    public static void main(String[] args) {

    }
}


class ClassA {
//    public static double methodA(double value){}   // ERROR
}

class ClassB {
    public static double methodA(double value) {    // Stranno no zdes nety owibki
        while (true) {
        }
    }
}

class ClassC {
    // Zdes owibka
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg;
//        }
//    }
}

class ClassD {
    public double sqr(double arg) {
        int k = 1;
        return k;
    }
}

class ClassF {
    public double sqr(double arg) {
        throw new RuntimeException();
    }
}

