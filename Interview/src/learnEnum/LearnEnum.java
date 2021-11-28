package learnEnum;

import jdk.swing.interop.SwingInterOpUtils;

public class LearnEnum {


    public static void main(String[] args) {
        System.out.println(Level.HIGH);
        System.out.println(Color.Blue);
        System.out.println(Computer.MACBOOK);
        System.out.println(Employees.James);
    }

    // we can not create enum inside a main method

    // Enum declaration can be done outside of a class or inside a class
    // but not inside a method
    //Enum Vs Class
    // An enum can just like  a call have attributes and methods
    //enum vs a class
    // an enum can just like a class have attributes and methods
    // enum is used with a values that is not going to change
    //// enum is to declare Enumerated data types , in Enum we declare unchangeable values or constants .
    // enum constants are declared as public static final they can not change

    // an enum can not be used to create objects and it can not extend other classed

    public enum Mobile {// we can create enum inside a class
    }

    public enum Level {
        HIGH, LOW, MEDIUM

    }

    public enum grades {AVRAGE, EXCELENT}

    enum Computer {
        HP,DELL,CHROMEBOOK,MACBOOK

    }// we can declare enum outside a class


}