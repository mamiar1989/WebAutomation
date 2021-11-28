package debug;

import java.util.Scanner;

public class learnDebugging {

    //Bug/Error /Defect
    //Debugging ; identify logical errors by yourself
    //BreakPoint
    //Debug
    //QA/Quality E/ Software Tester

    public static void main(String[] args) {

        learnDebugging.doPattern();

      /*  int num1 = 23;
        int num2 = 33;
        int num3 = 43;
        int num4 = 53;
        int num5 = 23;
        int sum = num1 - num2;// this is error is called logical error
        System.out.println("The summation value is " + sum);
// the debugging process is the fact of going back to your code setting breakpoint and checking line by line the code
        // that has a mistake will be highlighted
    }*/
    }
    public static void doPattern() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int rowNumber = input.nextInt();
        for (int i = 1; i < rowNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j+" ");
            }


        }


    }
}
