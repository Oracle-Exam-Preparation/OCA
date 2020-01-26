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
public class NullReferenceInterview {
    /*Измените код так, чтобы он вернул hello world на консоль. */
    //.....
    public static void main(String[] args) {
        NullReferenceInterview nullReferenceTest = null;
        System.out.println(nullReferenceTest/*.<some descriptor...>*/);
    }
}

/*
Через null ссылку можно обратиться к статике, следовательно могут быть такие варианты:
    1) Добавить в класс NullReferenceTest статическое поле string со значение "hello world"
    2) Добавить статический метод
*/