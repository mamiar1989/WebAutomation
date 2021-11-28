package basic;

public class TypeCasting {

    public static void main(String[] args) {
        double number = 25.5;
        int number1 = 30;
        double number2 = (double) number + number1;

        System.out.println(number2);

        double price = 35.99;
        int PriceDiscount = (int) price;
        System.out.println(PriceDiscount);

        int num1 = 60;
        int num2 = 50;
        int num3 = num1;
        int num4 = num2+num3;
        System.out.println(num4);
        int age =24;
        double  newAge=(double)age;
        System.out.println(newAge);


        int numberN =56;
        byte total= (byte) numberN;
        System.out.println(total); // the purpuse of type casting is save memory '


    }


}
