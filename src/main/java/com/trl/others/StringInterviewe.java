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
public class StringInterviewe {
    /*
     * Откуда-то был вызван метод method() с какими-то параметрами, и было получено:
     * Exception in thread "main" java.lang.NullPointerException at TestNPE.handle(TestNPE.java:12)
     *
     * В чём причина исключения — в fArgInt или s? Чтобы поменялось, если бы в девятой строчке было бы написано так:
     * if("".equals(s))
     * */
    public static void main(String[] args) {

//        Formater formater ;
        Formater formater = null;
//        Formater formater = new Formater();


//        String str;
//        String str = null ;
//        String str = "" ;
        String str = "abc";

        String returnValue = method(formater, str);
        System.out.println(returnValue);
    }

    public static String method(Formater formater, String value) {
        if (value.isEmpty()) {
//        if ("".equals(value)){
            return "(none)";
        }

        return formater.format(value.trim());
    }
}

class Formater {
    public String format(String value) {
        return "[" + value + "]";
    }


}
