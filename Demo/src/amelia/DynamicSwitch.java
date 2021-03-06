package amelia;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DynamicSwitch {


    public static void ageSelection() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        switch (age) {
            case 1:
                age=60;
                System.out.println(age + "you can apply for retirement ");

            case 2:
                age=58;
                System.out.println(age + "  you have 2 more years to go ");

            case 3:
                age=40;
                System.out.println(age + "you have 20 more years to go  ");

            case 4:
                age=30;
                System.out.println(age + " you still have 30 years to go");

            case 5:
                age=20;
                System.out.println(age + "you still have 30 years to go ");
            default:
                System.out.println( "Finish school First");

        }
        }

    public static void main(String[] args) {
        DynamicSwitch.ageSelection();
    }
}

