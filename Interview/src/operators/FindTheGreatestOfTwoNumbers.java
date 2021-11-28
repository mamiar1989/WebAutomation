package operators;

public class FindTheGreatestOfTwoNumbers {

    //Given three numbers 35,78,87   find the greatest number


    public static void main(String[] args) {
FindTheGreatestOfTwoNumbers.GreatestNumber();
FindTheGreatestOfTwoNumbers.largest(35,78,87);
    }

    public static void GreatestNumber() {
        int maxVal = 35;
        int val1 = 35;
        int val2 = 78;
        int val3 = 87;
        if (val1 > val2 && val1 > val3) {
            maxVal = val1;

        } else if (val2 > val1 && val2 > val3) {
            maxVal = val2;

        } else if (val3 > val1 && val3 > val2) {
            maxVal = val3;
        }
        System.out.println("the greatest number is " + maxVal);

    }
    public static double largest(double x, double y, double z){
        return Math.max(Math.max(x,y),z);

    }

}
