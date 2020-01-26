package com.trl.increment_decrement.postfix_increment.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 24/9/19
 */
public class Experience {
    public static void main(String[] args){
        int index = 1;
        try{
            A.method()[index=2]++;
        }
        catch (Exception e){  }
        System.out.println("index = " + index);
    }
}

class A {
    public static int[ ] method() {  return null;  }
}