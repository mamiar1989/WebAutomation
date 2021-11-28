package controlflow;

public class LearIfElse {

    // control flow means : make some decisions
    // if condition is true then it will execute if block
    // if condition is false then it will execute else block


    public static void main(String[] args) {

        int number = 32;

        if (number == 24) {
            System.out.println("number is equal 24");
        } else {
            System.out.println("number is not 24");
        }
        double nb = 25.5;
        if (nb == 55.5) {
            System.out.println("the number nb = to 55.5 ");
        } else if (nb == 66.2) {
            System.out.println("the number nb = to 66.2 ");
        } else if (nb == 25.5) {
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
            System.out.println("the number nb = 25.5 ");
        } else {
            System.out.println(" the number nb is not declared in this case ");
        }

        int age = 56;
        if (age >= 18 && age <= 21) ;
        {
            System.out.println("you are adult but  you can not  by cigarette ");
        }

        String gender = "female";

        if (gender == "female" || age >= 50 && number == 32) {
            System.out.println("you do not have to buy tickets ");
        } else {
            System.out.println("you do have to buy tickets");
        }
        if (gender == "male" || age >= 50 && number == 32) {
            System.out.println("you do not have to buy tickets ");
        }
        if (age >= 24 && gender == "female" && number == 35) {
            System.out.println("happy");

        } else {
            System.out.println("Zima");
        }
        String job = "QA";
        if (age >= 55 && gender == "femal" && number == 55 && job =="QA")
        {
            System.out.println(" anana");
        }








    }
}