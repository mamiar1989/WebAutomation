package String;

import java.sql.SQLOutput;
import java.util.Locale;

public class LearnString {

    // Sequence of Character
    public static void main(String[] args) {


        String BurgerName = "JAMES";
        String food = "couscous";
        System.out.println(food.length()); // Length of a String
        System.out.println(food.equals("Couscous"));  // Compare one String to the other
        System.out.println(food.equals("couscous"));
        System.out.println(food.equalsIgnoreCase("cousCous")); // this is to ignore the upper and lower case
        System.out.println(food.charAt(5)); //  want to see the 5th character of letter number 5 start from0
        // concept comes from array start from 0

        char charCompare = food.charAt(5);  // will return the character at number 5
        String name = "James";
        System.out.println(food.substring(3));  // i want to create subString from the char 3  "scous"
        System.out.println(food.substring(5));//
        System.out.println(food.toLowerCase());
        System.out.println(food.toUpperCase());
        String stId = "101";
        String LName = "William";
        System.out.println(stId.concat(LName)); // to concatinate between this 2 words

        // Exception Handling
        try {
            System.out.println(food.charAt(10));  // we have 8 character , execption
        } catch (Exception exception) {
            System.out.println("this is an exception, there is only 8 characters ");
        } finally {
            System.out.println();
        }

        System.out.println(food.contains("p"));
        System.out.println((food.contains("s")));


    }

}
