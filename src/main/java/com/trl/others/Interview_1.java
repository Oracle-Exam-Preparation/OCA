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
public class Interview_1 {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
        /*Что получим после выполнения кода: */
        int a = 0xFF0;
        int b = 0xF0F;
        int c = 0x0FF;

        c = a = (a ^ b | a & b) ^ c;
        System.out.println(c);
        System.out.println(a);
        System.out.println((c | a) ^ (c & a));
        /*Так как a = c, то (c | a) даст с, и (a & c) тоже даст c, ну а побитовая сума по модулю 2 даст 0,
        если суммировать два одинаковых числа. Ответ = 0.*/
//--------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------
    }
}

