package controlflow;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NestedForLoop {

    //  output


    //1
    //1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number");

        int rowNumber = input.nextInt();

        for (int i= 1; i<= rowNumber; i++) {
            for (int j =i; j <= i; j++) {
                System.out.println(j+"  ");
            }
            System.out.println();
        }

        }


    }
