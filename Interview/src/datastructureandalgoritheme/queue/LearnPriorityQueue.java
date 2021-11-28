package datastructureandalgoritheme.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    // TOP ELEMENT FROM PRIORITY QUEUE
    //PEEK Method only peek values from the queue
    public static void main(String[] args) {

        PriorityQueue<String> productList = new PriorityQueue<>();
        productList.add("T-Shirt");
        productList.add("shoes");
        productList.add("pants");
        productList.add("belts");
        productList.add("socks");
        productList.add("jackets");
        System.out.println(productList.peek());

        for (String st1 : productList) {
            System.out.println(" ProductList : " + st1);
        }


        PriorityQueue<Integer> productID = new PriorityQueue<>();

        productID.add(202);
        productID.add(201);
        productID.add(2066);
        productID.add(20);
        productID.add(2);
        productID.add(2602);
        productID.add(12);
        System.out.println(productID.peek());


        for (int st : productID) {
            System.out.println("The product ID  : " + st);
        }

        System.out.println("***************Using Pool Method***********************************");


   // peek() Retrieve but does not remove the head of the queue
        System.out.println(productID.peek());
   // pool() Retrieve but remove the head of the queue
        System.out.println(productID.poll());
        for (int st : productID) {
            System.out.println("The product ID  : " + st);
        }


    }
}
