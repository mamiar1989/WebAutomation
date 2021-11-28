package datastructureandalgoritheme.queue;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

// FiFo order
    // Queue means first in first off.


    public static void main(String[] args) {
        Queue<String> name = new LinkedList<String>();
        name.add("Lamia");
        name.add("Nafis");
        name.add("sam");
        name.add("nancy");
        name.add("dom");
        name.add("amel");
        name.add("jes");
        System.out.println(name.poll());

        for (String nm : name) {
            System.out.println("Student name  " + nm);
        }
//  Remove method

        name.remove("Lamia");
        name.remove("Nafis");


        for (String nm : name) {
            System.out.println("Student name  " + nm);
        }

        System.out.println("**************************Element************************");

        System.out.println(name.element());  // select the fist name from your list / when ever you remove a value it will pick the
        // the next one the list

        System.out.println("************************poll and Remove ************************");

        System.out.println(name.poll());  // poll the names from the list  , pick and remove'


        for (String ST: name)
        {
            System.out.println("Print all the values after poll method  :  " + ST);
        }

        System.out.println("************************Peak Method ************************");

    }


}

