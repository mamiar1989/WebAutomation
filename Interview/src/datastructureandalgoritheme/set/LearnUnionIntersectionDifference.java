package datastructureandalgoritheme.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifference {


    public static void main(String[] args) {
        int num1[] = {1, 4, 5, 7, 12, 25, 66, 78};
        int num2[] = {11, 44, 45, 79, 12, 25, 102, 304};


        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1, 4, 5, 7, 12, 25, 66, 78}));  // this method is used to put the values of the array
                                                                  // inside the ser
        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{11, 44, 45, 79, 12, 25, 102, 304}));

        //To do Union set
        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two sets = : " + union);  // used this set to print the 2 arrays without duplicate values

        // To do Intersection
        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println(" Intersection of two set" + intersection);  // intersection defines the same values


        //To do Symmetric Difference
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println( "difference of two sets" + difference);  // difference in both arrays


    }
}
