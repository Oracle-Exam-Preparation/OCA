package com.trl.general.a1aa;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 27/9/19
 */
public class Experience {
    public static void main(String[] args){
        final A a = new A(5);
        System.out.println("a --> " + a);

        A b = new A(10);
        System.out.println("b --> " + b);

        a.link = b;
        System.out.println("a --> " + a);

        System.out.println();
        b.link = A.setIt(a, b);
        System.out.println("b --> " + b);
        System.out.println("a --> " + a);

//        System.out.println(a.link.value);
//        System.out.println(b.link.value);
//        System.out.println(a.link.value+" "+b.link.value);
    }
}


class A {
    int value = 1;
    A link;
    public A(int val){ this.value = val; }

    public static A setIt(final A x, final A y){
        x.link = y.link;
        return x;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                ", link=" + link +
                '}';
    }
}