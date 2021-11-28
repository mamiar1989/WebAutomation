package OOP.polymorphism.MethodsOverriding;

import OOP.abstraction.ModernCar;

public class Bmw extends ModernCar {

     //   We need inheritance to override methods , means that when i extended this car i have inherited all the properties of
    // modern car .
    // When we override a method means that we can use the method / edit the method / replace by the override property
    // The explanation is that override annotation , when jvm is compiling this code he will execute remote start , then it will look
    // other method with the override annotation on it and it will execute it .
  // if you use the override annotation it will compile the parent code and check the override at runtime and understand that the method
    // body have changed

    @Override  // override annotation
    public void camera( ) {

    }

    @Override
    public void autoLineControl() {

    }

    @Override
    public void selfDriven() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void gps() {
        System.out.println("The gps is working better now ");

    }

    @Override
    public void emergencyBreak() {

    }
}
