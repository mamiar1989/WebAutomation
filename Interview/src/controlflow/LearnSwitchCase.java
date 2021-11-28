package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {

    public static void main(String[] args) {

        LearnSwitchCase.foodSelection();

    }

    public static void foodSelection() {
     /*   Scanner sn = new Scanner(System.in);

        System.out.println("Enter your food Selection");
        int foodSerial = sn.nextInt();
        String foodName;
        switch (foodSerial) {

            case 1:
                foodName = "coffee";
                String coffeeType = "Espresso";
                if (coffeeType == "Espresso") {
                    System.out.println("you selected Espresso coffee");
                } else if (coffeeType == "Ethiopian") {
                    System.out.println("you selected Ethiopian coffee");
                } else {
                    System.out.println("did not select any type");
                }


                break;

            case 2:
                foodName = "coscous";
                break;
            case 3:
                foodName = "Burger";
                break;
            case 4:
                foodName = "Momo";
                break;
            case 5:
                foodName = "kabab";
                break;
            case 6:
                foodName = "shaouara";
                break;
            case 7:
                foodName = "fish";
                break;
            case 8:
                foodName = "rice";
                break;
            case 9:
                foodName = "roman";
                break;
            case 10:
                foodName = "loubia";
                break;
            default:
                foodName = "Invalid Food Item selected";
        }
        System.out.println("selected 1" +
                "code" + foodName);
sn.close();
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shortcut to your phone number ");
        int phoneNumber = input.nextInt();

        switch (phoneNumber) {
            case 1:
                phoneNumber = 055;

                break;
            case 2:
                phoneNumber = 056;
                break;
            case 3:
                phoneNumber = 057;
                break;
            case 4:
                phoneNumber = 66;
                break;
            case 5:
                phoneNumber = 999;
                break;
            default:
                System.out.println("This is a short cut to the phone number" + phoneNumber);
                break;

        }


    }
}
