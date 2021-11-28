package basic;

public class Constructor {

   /* int age1 = 22;
    public static void main(String[] args) {
        Constructor ab = new Constructor();
    }
    public Constructor() {
        System.out.println("I am a public constructor");
    }
    public Constructor(int age, int number) {

        age = 25;
        number = 33;
        System.out.println(age + number);
        this.age1 = age;*/

    //Mahmadul*************************************************************************************

    // Constructor Rules
    // Constructor name should have the same name then the class name
    // Constructor has no return type
    // Constructor is used to initialize objects
    // constructors are only used to initialize objects
    // without parameter its called default constructor
    // with parameter it is called parameterized constructor
    String stName;
    String stAddress;
    String name;
    String Address;
    String pizzaName= "Dominos";
     double CourseFee;
    String stPhoneNumber;
    String courseFee;

    public Constructor() {  // default constructor
        System.out.println("This is default  constructor ");
        int num1 = 50;
        int num2 = 60;
        int total = num1 + num2;
        System.out.println("Total is " + total);


    }

    public Constructor(String name) { // SIGNATURE PATTERN OR PARAMETER  // Single parameterised constructor
        System.out.println("Student name is " + name);
    }

    public Constructor(String name, int age) {

    }
  public Constructor(String stAddress, String stName, String stPhoneNumber, String stCourseFee) {
        this.stAddress=stAddress;
        this.stName= stName;
        this.stPhoneNumber= stPhoneNumber;
        this.courseFee=stCourseFee;
      System.out.println( "The student Address is :" + this.stAddress + " The student name is : " +this.stName +" The student phone number is  " + this.stPhoneNumber + "The student courseFee is  "+  this.courseFee);
    };

    public Constructor(String name, String address) {  // need to make it different , can not be both String/ int
        this.stName = name;
        this.stAddress = address;
        System.out.println("Student name is :" + this.stName + " And Student Address is: " + address);
    }
    public static void main(String[] args) {

        Constructor cr = new Constructor();  // composed of the class name , object name and the last part is Constructor of a class
        Constructor student = new Constructor("AMEL"); // argument passing
        // composed of the class name , object name and the last part is Constructor of a class
        Constructor asir = new Constructor("Nasir KHRA");
        Constructor sir = new Constructor("Kenza", 25);
        Constructor si = new Constructor("Kenza", "France");
        Constructor gh= new Constructor("Queens", "Maria AMIAR", " 215 303 6026","5000");

    }
};





