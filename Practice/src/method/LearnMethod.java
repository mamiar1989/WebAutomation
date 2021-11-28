package method;

public class LearnMethod {
    // Method: block of code which runs when it is called. Method is used to perform
    // certain actions and they are known as function

    // Method Type:
    // Return Method without Parameter:
    // Return Method with Parameter:

    // Non Return Method without Parameter:
    // Non Return Method with Parameter:

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body}
    // ReturnType/MethodType : Data Type/Class Type
    // MethodName: verb+Noun

    // Method Syntax:
    // AccessModifier ReturnType/MethodType MethodName(){ Method Body }

    // Return Types are: All Data type, void,class and object.

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
    // }

    // Return Type Method
    public int doSummation() {
        int num1 = 50;
        int num2 = 60;
        int total = num1 + num2;
        System.out.println("Total value : " + total);
        return total;
    }

    // Return type Dynamic/ Parameterize method
    public int doSum(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total value : " + total);
        return total;
    }

    // Dynamic method:
    public int doSubs(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        System.out.println("Subtraction value " + (num1 - num2));
        return num1 - num2;
    }

    public int doSubtraction(int number1, int number2) {
        System.out.println("Subtraction value " + (number1 - number2));
        return number1 - number2;
    }

    public double doMultiPlay(double number1, double number2) {
        return number1 * number2;
    }

    public static void checkDisplay() {
        System.out.println("Method");
    }

    // Non Return Method without Parameter:
    public void studentInformation() {
        String name = "James";
        String address = "Queens,NY";
        System.out.println("Student name is " + name + " Address is " + address);
    }

    public void salaryCalculation() {
        int month = 12;
        double salary = 4500.500;
        double yearlySalary = month * salary;
        System.out.println("Yearly Salary " + yearlySalary);

    }

    // Non Return Method with Parameter:
    public void doDivision( double num1, double num2){
        double result= num1/num2;
        System.out.println("Division Result : "+result);
    }

    public static void stInfo(String name, String address, String dob, String phoneNumber){
        System.out.println("Student name "+name+ " Address "+address+" Data of Birth"+dob+" PhoneNumber "+phoneNumber);
    }

    public static void main(String[] args) {
        LearnMethod.checkDisplay();
        LearnMethod learn = new LearnMethod();
        int salary = 4000;
        double totalSalary = salary + learn.doSummation();
        System.out.println("Total Salary " + totalSalary); //
        learn.doSummation();

        learn.doSubs(340, 40);
        learn.doSum(200, 36);
        learn.doMultiPlay(30, 25);
        System.out.println(learn.doMultiPlay(40, 35));
        learn.studentInformation();
        learn.salaryCalculation();
        learn.doDivision(300,23);

        LearnMethod.stInfo("Mohammad Islam","Jamaica,NY","12/23/1985","25235335");


    }

}
