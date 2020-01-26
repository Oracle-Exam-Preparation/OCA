package com.trl.constructor.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Main {
    public static void main(String[] args) {
        new Child();
    }
}

class Bisabueilo {
    // y aqui me parese el compilador llama constructor de clase Object. Esto puede se falso!!!
    Bisabueilo() {
        System.out.println("Constructor Bisabueilo");
    }
}

class Abueilo extends Bisabueilo {
    // aqui por defect compilador simpre agrega la llamada al constructor de la clase bisabueilo.
    Abueilo() {
        System.out.println("Constructor Abueilo");
    }
}

class Padre extends Abueilo {
    Padre() {
        // aqui por defect compilador simpre agrega la llamada al constructor de la clase abueilo.
        System.out.println("Constructor Padre");
    }
}


class Child extends Padre {
    Child() {
        // aqui por defect compilador simpre agrega la llamada al constructor de la clase padre.
        System.out.println("Constructor Hijo");
    }
}

// Simpre por defecto se llama constructor padre.