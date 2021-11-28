package OOP.polymorphism.MethodsOverLoading;

public class Calculator {
    //  we can not create a variable with the same name , when we will call it . it will be confused
    // we give unique names to easily recognize
    // to make a method unique , give a different name , in java we can use the same name for the same method and use different parameters
    // the method overloading is the fact of using the same method name with different parameters
    //  you can overload it with different Signature patters
    //

    public static void main(String[] args) {
        Calculator.doSum(20, 66);
        Calculator.doSum(66, 88);
        Calculator.doSum(44, 55, 99);
        Calculator.stInfo("Amelia", "Angel");
        Calculator.doSum("Happy for my money", 88, 88, 99);
        System.gc();
    }
    public static void doSum(int num, int num1) {
        int total = num + num1;
        System.out.println("The total is " + total);

    }
    public static void doSum(int num, int num1, int num3) {
        int total = num + num1 + num3;
        System.out.println("The total is " + total);
    }
    public static void doSum(int num, int num1, int num3, int num4) {
        int total = num + num1 + num3 + num4;
        System.out.println("The total is " + total);
    }


    public static void doSum(String apple, int num1, int num3, int num4) {
        int total = num1 + num3 + num4;
        System.out.println("The total is " + total + apple);

    }

    public static void stInfo(String name) {
        System.out.println(name);

    }

    public static void stInfo(String name, String lastName) {
        String fullName = name + lastName;
        System.out.println("The full name is " + fullName);

    }


}
