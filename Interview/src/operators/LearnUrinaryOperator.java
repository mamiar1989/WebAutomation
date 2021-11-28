package operators;

public class LearnUrinaryOperator {

    // increment operator : ++ increment operator
    //preIncrement : ++ number
    //PostIncrement: number ++
    // increment operator : -- decrement operator

    //Decrement Operator : -- Decrease -1 for future
    // PreDecrement : --number;
    // PostDecrement : number --


    public static void main(String[] args) {
        int number = 30;

        // the pre increment operator is used before
        // the post increment operator is used after

        ++number; // means 1+30
        number++; // means the last value of number +1
        // meaning  the value is 31 in the second line the value is 32 . post increment the changes will be added in the next line not the
        // actual line
       /* ++number; // 1+30   this is 31
        number++;//31+ 1   ........   it take the last number
        number ++; //32+1
        ++number;33*/
        number++;
        number--;
        number--;
        number++;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(++number);



    }


}
