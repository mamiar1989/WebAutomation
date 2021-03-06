package amelia;

public class mimi {
    public static void main(String[] args) {

        int num1 = 35, num2 = 78, num3 = 87;

        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest Number");

        else
            System.out.println(num3+" is the largest Number");
    }

}
