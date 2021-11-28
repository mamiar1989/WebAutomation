package datastructureandalgoritheme.Array;

public class ArrayInMethods {

    public static void main(String[] args) {
        int[] numbers = {23, 34, 65, 12, 7, 102, 87, 46, 304};

        ArrayInMethods.checkMinimum(numbers);  // wan to confirm from the above list
        // wan to confirm from the above list
        ArrayInMethods.maximumNumber(numbers);
        System.out.println(ArrayInMethods.getArray());  // wont show the result in the console
ArrayInMethods.minimum(jobId);
ArrayInMethods.maximum(jobId);
    }

    /**  Author: Maria Amiar
     * this document commenting is created in order to explain what is happening in your methods
     * to explain what is going on in your code
     * @param num
     *
     */
    static void checkMinimum(int num[]) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println(min);

    }

    // array value starts from 0, when the index value starts from zero // when the loop will start it will start from 0
    // i am comparing the minimum value with the array 1rst index value , the array value depends on index
    // when the loop will start , the array will start from o, so if min is greater than o so this will be the value of min
    // which number is minimum number


    static int[] getArray() {
        return new int[]{88, 66, 78, 98, 23, 12, 458};

    }


    static void maximumNumber(int num[]) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(max);

    }


    static int[] jobId = {23, 25, 86, 97, 50};


     static void minimum(int num[]) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min < num[i]) {
                min = num[i];
            }
        }
        System.out.println(min);
    }

    static void maximum(int num[]) {
        int max = num[0];
        for (int i = 0; i > num.length; i++) {
            if (max > num[i]) {
                max = num[i];
            }
        }

        System.out.println(max);
    }




    }









