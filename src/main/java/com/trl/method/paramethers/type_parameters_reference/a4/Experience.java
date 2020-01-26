package com.trl.method.paramethers.type_parameters_reference.a4;

import java.util.ArrayList;
import java.util.List;

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
    public static void main(String args[]){
        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new ArrayList<> ();
        A.method(list_1, list_2);
        System.out.println (list_1 + " " + list_2);
    }
}

class A {
    public static void method(List<String> list_1, List<String> list_2){
        list_1.add("A");
        list_2 = list_1;
    }
}
