package datastructureandalgoritheme.sort;

public class LearnInsertionSort {

    public static void main(String[] args) {
        //insertion sort

        int[] number = {34, 23, 3, 6, 7, 120, 60, 56, 23};
// we have an array , we know how to get the array length , meaning get the length starting from index o
        // for the shifting  purpose we created a j value

//        for (int i = 0; i < number.length; i++){
//            System.out.println(number[i]);   // used to print all the values
//        }
        for (int i = 0; i < number.length; i++) {
            int j = i - 1;  // for the shifting purpose we created j variable to shift to the next value  //j= -1
            // means j-1 , start from index 0
            int point = number[i];  // this point value means start from index 0

            while (j >= 0 && number[j] > point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j + 1] = point;
        }
        for (int n = 0; n < number.length; n++) {   // this is used to print the values
            System.out.print(number[n] + " ");
        }


    }


}





