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
public class InnerClassInterviewe {
    /*Дан следующий код. Как вы думаете, что произойдет в результате выполнения данного кода? */
    class A {
        String str = "ab";

        // V konstryktore lydwe ne vuzuvat metodu, potomu chto eto cherevato owubkami
        public A() {
            printLength();
        }

        void printLength() {
            System.out.println(str.length());
        }
    }

    class B extends A {
        String str = "abc";

        void printLength() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new InnerClassInterviewe().new B();
    }
}

/*В результате выполнения данного кода возникнет NullPointerException, так как, создавая объект класса B, сначала
вызывается конструктор супер класса (родителя). В конструкторе родителя происходит вызов метода printLength(), который
переопределен в подклассе (наследнике), внутри этого метода идет обращение к переменной str наследника, которая еще
не проинициализирована и равна null, так как конструктор родителя еще не закончил свою работу, отсюда и исключение.

В действительности, вызов не финальных методов в конструкторе класса - это плохая практика, так как не статические
переменные в Java инициализируются после вызова конструктора супер класса (родителя).*/
