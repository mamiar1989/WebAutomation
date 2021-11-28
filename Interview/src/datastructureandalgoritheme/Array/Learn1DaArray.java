package datastructureandalgoritheme.Array;

public class Learn1DaArray {
    // ramSpace = Byte
    String name = "James "; //

    //Array :  which can hold multiple values of a same datatype
    // variable can hold one values time // a small container that can hold one value
    // Array can hold multiple values   // big container that can hold a lot of value
    // In array  you can not assign values in class level

    //*****How to declare an array******************************************************************
    // Data type []  variableName= new DataType[numberOfVariables]
    // data type[] name of array={  , , , , ,};
    // Declare an array

    public static String[] students = new String[6];   // declare an array in the class level you must mention if it static or now
    // declare an array in the class level you must mention if it static or now

    String[] addresses = new String[7];  // if we do not declare it as static we need to create an object to call the array
    public static int[] number = new int[5];
    String[] nameOfCar = new String[10];
    int[] phoneNumber = {86, 7, 8, 9, 26, 56, 66, 556};
    int[] carNumber = {1, 2, 3, 55};


    public static void main(String[] args) {


        double[] salary = {5000, 600, 8666, 6467, 5682};
        System.out.println(salary[0]);
        System.out.println(salary[3]);
        System.out.println(salary[2]);


        Learn1DaArray learn = new Learn1DaArray();
        int[] stId = {44, 56, 55, 96, 58};// non static/ dynamic array,
        // in this array you do not declare the value
        System.out.println(stId[0]);
        System.out.println(stId[1]);
        System.out.println(stId[2]);
        System.out.println(stId[3]);


        System.out.println(learn.phoneNumber[3]);

        Learn1DaArray.students[0] = "Jack";
        students[1] = "Jack";
        students[2] = "Sam";
        students[3] = "Jack";
        students[4] = "Jack";
        students[5] = "Jack";
        System.out.println(students[4]);

        learn.addresses[0] = "NY"; // you can not assign values in class level
        learn.addresses[1] = "NJ";
        learn.addresses[2] = "FL";
        learn.addresses[3] = "LA";
        learn.addresses[4] = "PA";
        learn.addresses[5] = "CA";
        learn.addresses[6] = "TX";
        System.out.println(learn.addresses[3]);


        number[0] = 25;
        number[1] = 23;
        number[2] = 22;
        number[3] = 21;
        try {
            System.out.println(number[5]);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("This is an ArrayIndexOutOfBoundsException");
        }
        Learn1DaArray lr = new Learn1DaArray();
        lr.nameOfCar[0] = "Toyota";
        lr.nameOfCar[1] = "CRV";
        lr.nameOfCar[2] = "Honda";
        lr.nameOfCar[3] = "Hyundai";
        lr.nameOfCar[4] = "Audie";
        lr.nameOfCar[5] = "Volkswagen";
        lr.nameOfCar[6] = "Kia";
        lr.nameOfCar[7] = "Nissan";
        lr.nameOfCar[8] = "Subaru";
        lr.nameOfCar[9] = "xfinity";
        System.out.println(lr.nameOfCar[9]);


        int[] number1 = new int[6];
        number1[0] = 20;
        number1[1] = 12;
        number1[2] = 16;
        number1[3] = 18;
        number1[4] = 14;
        number1[5] = 123;
        System.out.println(number1[4]);
//*************************** For loop*********************************************************************


        for (int i = 0; i < number1.length; i++) {
            System.out.println("Numbers are " + number1[i]);
        }
        System.out.println("********************Number of Cars**************************");

        for (int i = 0; i < lr.nameOfCar.length; i++) {
            System.out.println(lr.nameOfCar[i]);
        }

        for (int i = 0; i < stId.length; i++) {
            System.out.println(stId[i]);
        }
//******************For each loop    ***********************************************************************

        for (String st : lr.nameOfCar) {
            System.out.println("nameOfCar is " + st);

        }

        for (int n1 : number1) {
            System.out.println("numbers are " + n1);
        }


        for (String stn : students) {
            System.out.println("student name " + stn);
        }

        for (int std : stId) {
            System.out.println("StudentId " + std);
        }

        for (double slry : salary) {
            System.out.println("employees salary" + slry);
        }
//***************************************************************************
for (int cn: learn.carNumber){
    System.out.println(cn);
}



    }


}
