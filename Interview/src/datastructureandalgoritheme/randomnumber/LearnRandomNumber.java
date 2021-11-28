package datastructureandalgoritheme.randomnumber;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class LearnRandomNumber {

    // Generate random number


    public static void main(String[] args) {

        int[] stId = new int[10];
        Random random = new Random(50);  // seed is start point
        for (int i = 0; i < stId.length; i++) {
            stId[i] = random.nextInt(400);   // bound means end point
            System.out.println(stId[i]);
        }


        int[] std = new int[20];
        Random random1 = new Random();
        for (int i = 0; i < std.length; i++) {
            std[i] = random1.nextInt(200);
            System.out.println("the integer is " + std[i]);
        }


        float num1[] = new float[6];
        Random random3 = new Random();
        for (int i = 0; i < num1.length; i++) {
            num1[i] = random.nextFloat();
            System.out.println("The float number is " + num1[i]);


        }

        int num[] = new int[5];
        Random random2 = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random2.nextInt(100);
            System.out.println("The second integer is " + num[i]);
        }

        // math . random , everytime generate random values

        System.out.println(Math.random());
        System.out.println(" NY201 "+Math.random());

    }


}
