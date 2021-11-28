package OOP.abstraction;

public class GeneralMotor implements Car {
    String brand = "BMW"; //  we can reassign a value where the implementation happens

    String carModel = "M23";    // we can declare , assign and reassign value
    String modelYear = "M23";
    static double Price = 70000;
    int gmCarQty;


    // when you add a method in interface you need to implement it automatically
    // this is called complete class as it implements car (interface )
    // when you implements an interface you are allowed to use its variables

    // Add one more method

    public static void carInfo() {
        System.out.println("This is general Motor car ");

    }

    public boolean willBeAvailable(boolean availability) {
        boolean releaseMonth = availability;
        System.out.println("This is general Motor car ");
        return releaseMonth;

    }

    public void startCar() {
        System.out.println("GeneralMotors car have a start feature");

    }

    public void stopCar() {
        System.out.println("GeneralMotors car have a stop feature");


    }

    public void wheelCar() {
        System.out.println("GeneralMotors car have wheel");


    }

    public void engineCar() {
        System.out.println("GeneralMotors car have engine");


    }

    public void accelerationCar() {
        System.out.println("GeneralMotors car have acceleration");


    }

    public void steeringCar() {
        System.out.println("GeneralMotors car have a steering ");


    }

    public void brakeCar() {
        System.out.println("GeneralMotors car have a start feature");


    }

    public void navigation() {

    }
}
