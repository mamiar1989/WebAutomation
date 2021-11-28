package basic;

import java.util.Scanner;

public class MainMethod {

    public static String mobilePhone = "Iphone";
    public static int a = 20;
    private static int ae = 24;

    public static void main(String[] args) {
        System.out.println(mobilePhone);

        //Variables *****************************************
        //Operations

        int a = 20;
        int b = 30;
        double g = 5.5;
        float l = 555.55599f;
        long h = 555555555555555l;

        System.out.println(a + b + g);
        System.out.println(l - b);
        System.out.println(h / b);


        // Scanner*****************************************
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Last name  ");
        String name = sn.next();
        System.out.println("Enter first name ");
        String lName = sn.next();
        System.out.println(" Enter Age");
        int age = sn.nextInt();

        //Access Modifier *******************************************************

//        private
//        public
//        protected
//

        //Static and nON Static ***********************************************************************
        // We can call a non static variable by the class name , they reside in class level ,


        String StName = "Esha";    // static global variable
        String StAddress = " New York";   // non static

        // NESTED CLASS ******************************************************************************

        System.out.println(Computer.computerNamePrice);   // In a nested class you have to use the neames of the class
        // you have your variables in ///same rules apply , if you have a satic variable you can call it by the class name
        // for non static you have to create an object
        Computer com = new Computer();
        System.out.println(com.computerName);
        Computer.Mobile MB = new Computer.Mobile();
        System.out.println(MB.MobileBrand);
        System.out.println(MB.mobilePrice);


    }

    public static class Computer {// in a nested class you can not create a static variable inside a class , unless the class i
        //itself is static
        // Nested meaning class inside another ,
        static int a = 55;
        String computerName = "HP";
        static String computerNamePrice = "2000";

        public static class Mobile {
            String MobileBrand = "Iphone";
            int mobilePrice = 1200;

        }
    }

}


