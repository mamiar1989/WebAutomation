package random;

import java.util.Scanner;

public class Switchst {


    public static void main(LearnStringST[] args) {

        Switchst.codenumber();


    }

    public static void codenumber() {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the required code");
        int codeNumber = input.nextInt();
        switch (codeNumber) {
            case 1:
                int keynumber = 22;
                String color="blue";
                codeNumber = 5;
                if (keynumber == 5 && color == "bleu") {
                    System.out.println("The bleu code is displayed");
                }else {
                    System.out.println( "The door can be opened both codes are displayed ");
                }
                break;
            case 2:
                codeNumber = 55;
                break;
            case 3:
                codeNumber = 355;
                break;
            case 4:
                codeNumber = 65;
                break;
            case 5:
                codeNumber = 66;
                break;
            case 6:
                codeNumber = 85;
                break;
            default:
                System.out.println("The code number is " + codeNumber);
        }
    }
}






