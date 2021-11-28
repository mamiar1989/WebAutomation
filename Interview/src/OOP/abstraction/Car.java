package OOP.abstraction;

public interface Car {
    // interface is a prototype, before creating an object ex car you need to design a plan
    // in an interface you can't  declare  a variable you must assign a value otherwise it will show n error
    // abstract class used to group methods with empty bodies
    // Interface must be implemented by other classes to use it methods use the implement  not extend key word
    // java class can implement an interface
    // interface 100% abstract
    // interface you are limited (you can change it to a class by typing in the place of interface)
    // we cannot declare static variable in interface
    // we can declare a method but it must be empty or without body

    // Declare variable  and assign values
    // All properties are final we can not reassign a value
    String carName = "Toyota";   // variables must be declared with values
    String price = "23000";


    String brand = "23000";
    int carQuantity = 200;
    String sear = "2";
    String headLight = "4";
    boolean gasTank = true;

    // Declare Methods
    public void startCar();

    public void stopCar();

    public void wheelCar();

    public void engineCar();

    public void accelerationCar();

    public void steeringCar();

    public void brakeCar();

    public void navigation();

    public interface newCar {

        // nested interface
        public void carRoof();
    }

    public static int carDoor(int doorNumber) {  // if you declare a method with a body , you must have the static
        int totalDoor = 1 * doorNumber;// keyword otherwise it will show error
        System.out.println( " total doors is 2 " );
        return totalDoor;
    }


}


