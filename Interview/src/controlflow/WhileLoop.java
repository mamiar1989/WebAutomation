package controlflow;

public class WhileLoop {


    public static void main(String[] args) {

        int age = 24;
// Increment
        while (age > 21)   // first will check the condition then print the statement
        // it will execute from the loop when condition is fall
        {
            System.out.println("your age is greater than 21");
            age--;
        }


// Decrement

        int age1 = 20;

        while (age1 <= 30)   // first will check the condition then print the statement
        {
            System.out.println("your age is greater than 21");
            age1++;
        }

        System.out.println("**********************Nested While  Loop**********************");

        int number = 24;
        int qty = 30;
        while (number > 21) {
            System.out.println("your age is greater than 21");
            number--;
            while (qty < 35) {
                System.out.println("we are ordering Pizza");
                qty++;
            }
        }


    }
}
