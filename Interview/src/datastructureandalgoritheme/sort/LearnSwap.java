package datastructureandalgoritheme.sort;

public class LearnSwap {


    public static void main(String[] args) {
        int num1=45;
        int num2=55;
        int temp;
        System.out.println("Number One Value is " + num1);
        System.out.println("Number One Value is " + num2);

        temp=num1;
        System.out.println( " Temp is getting the value from num1 : because temp = num1 "+ temp);  // we can reassign the value , change the value
        num2=temp;  // number 2 = 45
        num1=temp+num2; // num 1 = 45+45  =90
        System.out.println(" The addition of both is "+ num1);
        temp=num1;
        temp=num2;  // dbhuevery time we use equal we will change the values of our variables .// we can reassign values everytime
        System.out.println(temp);



    }










}
