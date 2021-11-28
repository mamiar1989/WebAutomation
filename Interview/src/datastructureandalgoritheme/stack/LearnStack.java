package datastructureandalgoritheme.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    // Stack : LIFO   ; last in first out
    // push() use the PUSH method to push elements on the top of the stack
    // pop() use POP method to pop elements from the top of the sa
    // peek() look at the top of the stack without removing it


    public static void main(String[] args) {

        Stack<Integer> priceList = new Stack<>();
        priceList.push(23);
        priceList.push(21);
        priceList.push(20);
        priceList.push(22);
        priceList.push(25);
        priceList.push(30);
        priceList.push(35);
        System.out.println(priceList.search(22));
        System.out.println(priceList.empty());
        LearnStack.stackSearch(priceList, 25 );

        Stack<String> clothingList = new Stack<>();
        clothingList.push("pant");
        clothingList.push("skirt");
        clothingList.push("hat");
        clothingList.push("gloves");// push method add the value in your stack , on the top of the stack
        clothingList.push("scarf");
        clothingList.push("t-shirt");
        clothingList.push("heels");
        System.out.println(clothingList + "The first time print ");
        System.out.println(clothingList.push("Jeans") + " Added jeans ");
        System.out.println(clothingList + "  the whole list ");
        System.out.println(clothingList.pop() + " after the pop");

        // Lifo in stack means that the last one in is the first one to be removed
        System.out.println("***************FOR Each Loop***************************************");
        for (String t : clothingList) {
            System.out.println(t);

            System.out.println("*************************While loop**********************************");
            Stack<String> clothingId = new Stack<>();

            // add the values using for loop

            for (int i = 0; i < 7; i++) {
                clothingId.push("Clothing" + i); // iterate the clothing until 7
            }
            System.out.println(clothingId);

        }
        System.out.println("**********************example with integer**********************");
        Stack<Integer> numb = new Stack<>();
        for (int i = 0; i < 10; i++) {
            numb.push(2);
            System.out.println(numb);
        }

        System.out.println("*******************Iterator*****************************");
        Iterator it = clothingList.iterator();
        while (it.hasNext()) {
            System.out.println(" pop values :" + clothingList.pop());  // means at this point we removed all the values

        }
        System.out.println("*************************POP all the values means nothing left ********************************");

// Retrieve all the values
        // for Each loop
        for (String st : clothingList)
            System.out.println(st);
    }

    public static void stackSearch(Stack<Integer> sta, int element) {
        Integer position = sta.search(element);
        if (position == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element found at position " + position);
        }

    }


}