package com.trl.variable.inheritance.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 31/8/19
 */
public class Experience {
    public static void main(String[] args) {
        Child child = new Child();
//        System.out.println("child.privateVariable = " + child.privateVariable);      // COMPILATION ERROR
        System.out.println("child.packageVariable = " + child.packageVariable);
        System.out.println("child.protectedVariable = " + child.protectedVariable);
        System.out.println("child.publicVariable = " + child.publicVariable);
        System.out.println("child.publicStaticVariable = " + child.publicStaticVariable);
        System.out.println("Child.publicStaticVariable = " + Child.publicStaticVariable);
        System.out.println("child.publicFinalVariable = " + child.publicFinalVariable);
        System.out.println("child.publicStaticFinalVariable = " + child.publicStaticFinalVariable);
        System.out.println("Child.publicStaticFinalVariable = " + Child.publicStaticFinalVariable);
        System.out.println("=========================================================================================");

        Child2 child2_child2 = new Child2();
//        System.out.println("child2_child2.privateVariable = " + child2_child2.privateVariable);      // COMPILATION ERROR
        System.out.println("child2_child2.packageVariable = " + child2_child2.packageVariable);
        System.out.println("child2_child2.protectedVariable = " + child2_child2.protectedVariable);
        System.out.println("child2_child2.publicVariable = " + child2_child2.publicVariable);
        System.out.println("child2_child2.publicStaticVariable = " + child2_child2.publicStaticVariable);
        System.out.println("Child2.publicStaticVariable = " + Child2.publicStaticVariable);
        System.out.println("child2_child2.publicFinalVariable = " + child2_child2.publicFinalVariable);
        System.out.println("child2_child2.publicStaticFinalVariable = " + child2_child2.publicStaticFinalVariable);
        System.out.println("Child2.publicStaticFinalVariable = " + Child2.publicStaticFinalVariable);
        System.out.println("=========================================================================================");

        Parent parent_child2 = new Child2();
//        System.out.println("parent_child2.privateVariable = " + parent_child2.privateVariable);      // COMPILATION ERROR
        System.out.println("parent_child2.packageVariable = " + parent_child2.packageVariable);
        System.out.println("parent_child2.protectedVariable = " + parent_child2.protectedVariable);
        System.out.println("parent_child2.publicVariable = " + parent_child2.publicVariable);
        System.out.println("parent_child2.publicStaticVariable = " + parent_child2.publicStaticVariable);
        System.out.println("Parent.publicStaticVariable = " + Parent.publicStaticVariable);
        System.out.println("parent_child2.publicFinalVariable = " + parent_child2.publicFinalVariable);
        System.out.println("parent_child2.publicStaticFinalVariable = " + parent_child2.publicStaticFinalVariable);
        System.out.println("Parent.publicStaticFinalVariable = " + Parent.publicStaticFinalVariable);
    }
}

class Parent {
    private String privateVariable = "___";
    String packageVariable = "___";
    protected String protectedVariable = "___";
    public String publicVariable = "___";
    public static String publicStaticVariable = "___";
    public final String publicFinalVariable = "___";
    public static final String publicStaticFinalVariable = "___";
}

class Child extends Parent {
}

class Child2 extends Parent {
    private String privateVariable = "***";
    String packageVariable = "***";
    protected String protectedVariable = "***";
    public String publicVariable = "***";
    public static String publicStaticVariable = "***";
    public final String publicFinalVariable = "***";
    public static final String publicStaticFinalVariable = "***";
}