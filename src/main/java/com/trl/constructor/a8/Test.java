package com.trl.constructor.a8;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
Which of the following complete the constructor so that this code prints out 50? (Choose all that apply)

public class Cheetah {
    int numSpots;
    public Cheetah(int numSpots) {
        // INSERT CODE HERE
    }
    public static void main(String[] args) {
        System.out.println(new Cheetah(50).numSpots);
    }
}

A. numSpots = numSpots;
B. numSpots = this.numSpots;
C. this.numSpots = numSpots;
D. numSpots = super.numSpots;
E. super.numSpots = numSpots;
F. None of the above.

C. Within the constructor numSpots refers to the constructor parameter. The instance variable is hidden because they have
the same name. this.numSpots tells Java to use the instance variable. In the main() method, numSpots refers to the instance
variable. Option A sets the constructor parameter to itself, leaving the instance variable as 0. Option B sets the
constructor parameter to the value of the instance variable, making them both 0. Option C is correct, setting the instance
variable to the value of the constructor parameter. Options D and E do not compile.
*/