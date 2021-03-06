package amelia;

import java.util.Scanner;

public class nestedIfstatement {


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println( "Enter your age plz");
        int age= input.nextInt();
        String gender= "male";
        if( age <20 ) {
            System.out.println( "you can register to vote!");
        }  else if ( age<=20)
        {
            System.out.println( " you are allowed to  vote ! ");
        } else if ( gender == "female"  && age ==22) {
            System.out.println(" you can vote 1rst ! ");


        }


    }
}