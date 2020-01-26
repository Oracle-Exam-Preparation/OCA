package com.trl.class_.class_nestedClass_nestedStaticClass_innerClass.nestedClass.innerClass.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 15/07/19
 */
public class TopLevelClass {

    class A {
        class B {
            class C {
                class D {
                    class E {
                        void someMethod() {
                            System.out.println("Hello from Inner Class E");
                        }
                    }
                }
            }
        }
    }

}

class Main {
    public static void main(String[] args) {

        // Ropecabesa ))).
        // Para poder crear "Inner Class" se necesita enlase de clase que esta mas alto en nivel de hirarquia.

        TopLevelClass topLevelClass = new TopLevelClass();
        TopLevelClass.A a = topLevelClass.new A();
        TopLevelClass.A.B b = a.new B();
        TopLevelClass.A.B.C c = b.new C();
        TopLevelClass.A.B.C.D d = c.new D();
        TopLevelClass.A.B.C.D.E e = d.new E();
        e.someMethod();


        TopLevelClass.A.B.C.D.E ref = new TopLevelClass().new A().new B().new C().new D().new E();
        ref.someMethod();

        // Exemplo mas sencillo. Para poder crear clase BB necesitamos enlace de tipo AA.
        // Porjemplo ...
        AA aa = new AA();
        // Y ahora si queremos crear classe BB, tenemos que utilizar enlace de clase AA.
        AA.BB bb = aa.new BB();
        // Y ahora con enlace bb ya podemos trabajar con esta clase.
        bb.someMethod();

        // Tambien se puede iniciar de esta manera.
        AA.BB bb1 = new AA().new BB();
        bb1.someMethod();

    }
}

class AA {

    class BB {
        void someMethod() {
            System.out.println("Hello from Inner Classe");
        }
    }

}