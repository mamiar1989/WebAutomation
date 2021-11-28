package exceptionHandeling;

public class LearnFinalFinallyFinalize {
// any line of code that can throw an exception can be put in the try and catch block
    // finalize is used for clean up/
    final int number=24;   // final int value can not change

    public static void main(String[] args) {
        LearnFinalFinallyFinalize.doDivision(20,0);
        LearnFinalFinallyFinalize FN= new LearnFinalFinallyFinalize();
    LearnFinalFinallyFinalize FN1= new LearnFinalFinallyFinalize();
    LearnFinalFinallyFinalize FN2= new LearnFinalFinallyFinalize();
    LearnFinalFinallyFinalize FN3= new LearnFinalFinallyFinalize();
    LearnFinalFinallyFinalize FN4= new LearnFinalFinallyFinalize();
    // Everytime we create an object , then at the end of the day the objects created are ot use
        // to get ride of the unused properties will be sent to the garbage collection .
        System.gc();
        // its a good practice to use the garbage collection after your program to clean up the unused items

    }

    public static int doDivision(int num1, int num2) {
        int result=0;
        try { result = num1 / num2;
            System.out.println("Division value is " + result);
        } catch (Exception exception) {
            //exception.printStackTrace(); you have to comment that in in order to print your custom message
            System.out.println(" This is an arithmetic exception");
        }finally {// finally block is a life saver ,if you need to execute the this lin eof code , put it in the finally block
            // the finally block of code is the one that need to
            System.out.println( "this is the finally block , this line of code can be anything");
        }
        return result;
    }


}
