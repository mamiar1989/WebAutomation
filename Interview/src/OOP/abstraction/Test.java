package OOP.abstraction;

public class Test {

// I want to call my methods in here// as it is an object oriented concept we will have one main method
// when you create an object of general motors car we can call the variables of interface
    // interface variables are final , you can not reassign a value

    public static void main(String[] args) {  // we are using the methods from the car interface

        GeneralMotor gm = new GeneralMotor();
        gm.stopCar();
        gm.startCar();
        System.out.println(gm.brand);
        Car.carDoor(2);  // for static methods we can call by the class name
        System.out.println(gm.brand);


        Tesla ts= new Tesla();
        ts.brakeCar();
        ts.startCar();
        ts.stopCar();
        ts.stopCar();
        ts.carRoof();
        ts.startCar();
        ts.autoPark();
        ts.BoostEngine();
        ts.largeDisplay();





    }



}
