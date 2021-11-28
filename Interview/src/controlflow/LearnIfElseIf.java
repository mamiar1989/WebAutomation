package controlflow;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LearnIfElseIf {


    // else if means another if or adding more condition
    public static void main(String[] args) {
       // LearnIfElseIf.retirementCalculation();
        LearnIfElseIf.iphoneInformation();
    }

    public static void retirementCalculation() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age please");
        int age = input.nextInt();
        if (age <= 24 && age <= 40) {
            System.out.println("your age is  more than 24 ");
        } else if (age >= 40 && age <= 50) {
            System.out.println("your age is more than 48");
        } else if (age >= 50 && age <= 60) {
            System.out.println("your age is more than 58");
        } else if (age >= 68 && age <= 70) {
            System.out.println("your age is more than 68");
        } else {
            System.out.println("its your retirement time ");
        }
    }

    int price = 1500;
    String oldornew = "new";


    public static void iphoneInformation() {

        Scanner sn = new Scanner(System.in);
        System.out.println(" Enter your phone information");
        String brand = sn.next();
        if (brand == "Iphone") {
            System.out.println("the phone brand is iphone");}
            else if(brand != "Iphone") {
                System.out.println("the phone brand is  not iphone");

            }else {
            System.out.println( "lalala");
        }


        }


    }




