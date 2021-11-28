package exceptionHandeling;

public class SalaryCalculation {

    int div;

    public static void main(String[] args) throws Exception {
        //  SalaryCalculation.doDivision(20, 0);
        SalaryCalculation nb = new SalaryCalculation();
        try {
            nb.DoDivision1(23, 0);
        } catch (Exception exception) {
            System.out.println("this is an arithmetic exception  ");
        }
    }


    public static int doDivision(int num1, int num2) {
        int result = num1 / num2;
        try {
            System.out.println("Division value is " + result);
        } catch (Exception exception) {
            //exception.printStackTrace(); you have to comment that in in order to print your custom message
            System.out.println(" This is an arithmetic exception");
        }
        return result;
    }


    public int DoDivision1(int num1, int num2) throws Exception {
        this.div = num1 / num2;
        System.out.println("This is Division" + div);
        return div;


    }
}