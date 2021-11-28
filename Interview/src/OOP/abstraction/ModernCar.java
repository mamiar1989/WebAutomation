package OOP.abstraction;

public abstract class ModernCar  {
    // Abstract class ,// A regular class just add the word abstract


    String ModernCarBrand = "Audi";
    double modernCarSuggestedPrice = 75000;

// Abstract method


    public abstract void camera();

    public abstract void autoLineControl();

    public abstract void selfDriven();

    public abstract void autoPark();

    public abstract void gps();

    public abstract void emergencyBreak();

    // Static and non static methods are allowed here

    public void remoteStart(){
        System.out.println("ModernCar Remote S ");
    }






}
