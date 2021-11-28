package datastructureandalgoritheme.linklist;

import datastructureandalgoritheme.arraylist.LearnArrayList;

import java.util.LinkedList;

public class LearnLinkList {

    // MANIpulation with Linked List is faster then ArrayList


    LinkedList<String> stFatherName = new LinkedList<>();
    LinkedList<String> pizzaName= new LinkedList<>();

    public static void main(String[] args) {
        LearnLinkList ls = new LearnLinkList();
        ls.stFatherName.add("William");
        ls.stFatherName.add("Jhon");
        ls.stFatherName.add("Bob");
        ls.stFatherName.add("Joe");
        ls.stFatherName.add("Mac");
        ls.stFatherName.add("Sam");
        ls.stFatherName.add("George");
        ls.stFatherName.add("liam");
        System.out.println(ls.stFatherName.get(2));
        // How to retreive all the values

        for (String st : ls.stFatherName) {
            System.out.println("The Father's name list " + st);
        }

    ls.getPizzaList();


    }
   public void getPizzaList(){
            pizzaName.add("Beef");
             pizzaName.add("peperoni");
             pizzaName.add("vegetarian");
             pizzaName.add("onion");
             pizzaName.add("seeFoodPizza");
             pizzaName.add("pineapple ");
             pizzaName.add("olives ");
             pizzaName.add("Mushroom ");
             pizzaName.add("pepper ");

             for( String lm: pizzaName){
                 System.out.println(lm);
             }

        }





    }



