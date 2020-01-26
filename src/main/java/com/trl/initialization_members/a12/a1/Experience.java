package com.trl.initialization_members.a12.a1;

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
        new A().method();
    }
}

class A {
    private int i;
    void method(){
        while(i <=5){
            for(int i=1; i <= 5;){
                System.out.print(i+" ");
                i++;
            }
            i++;
        }
    }
}
