package datastructureandalgoritheme.sort;

public class LearnBubbleSort {


    public static void main(String[] args) {
        int stId[] = {3, 56, 78, 25, 5, 12, 99};

        System.out.println("Before Bubble Sort");
        for (int i = 0; i < stId.length; i++) {
            System.out.print(stId[i] + " ");
        }
        System.out.println();

        System.out.println("After Bubble sort");
        LearnBubbleSort.bubbleSort(stId);
        for (int i = 0; i < stId.length; i++) {
            System.out.print(stId[i] + " ");
        }
            System.out.println();

    }
    public static void bubbleSort(int num[]) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < (num.length - i); j++) {
                if (num[j - 1] > num[j]) {
                    //swap
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    }
