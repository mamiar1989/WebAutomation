package operators;

public class Conditionaloperator {

   // &&  conditional AND both condition need to be true to execute if block
    // || Conditions or: if one condition is true to execute the block
   public static void main(String[] args) {
       int num1 =50;
       int num2=60;
       if (num1 == num2) { // if condition is false then it will not execute if block of code
           System.out.println("number 1 is smaller then number 2");


           if (num1 == 55 && num2 == 60) {
               System.out.println("We are comparing two number ");
           }
            if (num1 == 55 || num2 == 60){
                System.out.println("We are comparing two number using  or operators");
            }



       }
   }





}
