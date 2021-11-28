package OOP.abstraction;

public class Tesla extends ModernCar implements Car, AutoPilot {

    // A class can implement Multiple interfaces at  a time but can extend one class at a time only
    // extends mean getting access for  all the properties
    // we have methods coming from ModernCar, Car, BoostEngine


    // This Strings are created in tesla Methods
    String teslaCarModel = "T45";
    double testCarT45Price = 100000;


    // This Methods are created in tesla Methods
    public void teslaCarIfo() {
        System.out.println("Tesla car Information ");
    }


    // ThiS Methods come from the implementation
    public void startCar() {
        System.out.println("Tesla car ");
    }

    public void stopCar() {
        System.out.println("Tesla car ");

    }

    public void wheelCar() {
        System.out.println("Tesla car ");

    }

    public void engineCar() {
        System.out.println("Tesla car ");


    }

    public void accelerationCar() {
        System.out.println("Tesla car ");


    }

    public void steeringCar() {
        System.out.println("Tesla car ");


    }

    public void brakeCar() {
        System.out.println("Tesla car ");


    }

    public void navigation() {
        System.out.println("Tesla car ");


    }

    public void camera() {

    }

    public void autoLineControl() {

    }

    public void selfDriven() {

    }

    public void autoPark() {

    }

    public void gps() {

    }

    public void emergencyBreak() {

    }

    public void autoPilot() {

    }

    public void largeDisplay() {

    }

    public void BoostEngine() {

    }


    public void carRoof() {

    }
}
