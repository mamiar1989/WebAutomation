package basic;

import java.util.Scanner;

public class ScannerPractice {

    // Class name is Scanner
    //
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name ");
        String fName = input.next();
        System.out.println("Enter your last name");
        String LName = input.next();
        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println("Enter your Grade");
        String grade = input.next();
        System.out.println("Enter your courseFee");
        double courseFee = input.nextDouble();
        input.close();
*/
        surpriseParty();

    }
       public static void surpriseParty(){
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter your birthday party theme");
        String birthdayPartyTheme = dc.next();
        System.out.println("Enter the number of guests");
        int guests=dc.nextInt();
        System.out.println("Enter the number of kids ");
        int kids=dc.nextInt();
         System.out.println("Enter the  Price for a surprise gift ");
        double price=dc.nextDouble();
         System.out.println("Enter the theme of the surprise party gift for thee kids  ");
        String surprisePartGift=dc.next();
        dc.close();
       }




    }

