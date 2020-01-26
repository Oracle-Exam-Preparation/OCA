package com.trl.method.paramethers.type_parameters_reference.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/10/19
 */
public class Experience {
    public static void main(String[] args) {
        B b = new B();
        b.method_A_2();
        System.out.println(b.getA());

        b.method_B_2();
        System.out.println(b.getA());

        b.method_C_2();
        System.out.println(b.getA());
    }
}

class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
class B {
    private A a = new A("1");

    public A getA() {
        return a;
    }

    public void method_A(A value) {
        value = null;
    }

    public void method_A_2() {
        method_A(a);
    }

    public void method_B(A value) {
        value = new A("2");
    }

    public void method_B_2() {
        method_B(a);
    }

    public void method_C(A value) {
        value.setName("2");
    }

    public void method_C_2() {
        method_C(a);
    }
}