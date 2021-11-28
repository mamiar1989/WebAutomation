package datastructureandalgoritheme.arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {


    public static void main(String[] args) {

        List<String> StateNameList = new ArrayList<>();
        List<String> StateNameList1 = new LinkedList<>();
        StateNameList.add("Ny");
        StateNameList.add("PA");
        StateNameList.add("CA");
        StateNameList.add("VA");
        StateNameList.add("OH");
        StateNameList.add("CO");
        StateNameList.add("VA");
        StateNameList.add("MI");
        StateNameList.add("Ny");
        StateNameList.add("CO");
        StateNameList.add("Il");
        StateNameList.add("CH");
        StateNameList.add("PA");


        // How to retrieve all the values


        List<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(20);
        numbers.add(21);
        numbers.add(19);
        numbers.add(18);
        numbers.add(15);
        numbers.add(11);
        numbers.add(10);
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        System.out.println(numbers.remove(3));

        Iterator it0 = numbers.listIterator();
        while (it0.hasNext()) {
            System.out.println(" Print all the numbers " + it0.next());
        }

        for (String st : StateNameList) {
            System.out.println("All the values are " + st);
        }


        System.out.println("***************Before Remove ***********************************");

//Iterator= meaning iterate the value

        // Explanation : we create an Iterator Variable it , and we create a condition that is as long as there is a next value print it .
        Iterator it = StateNameList.listIterator();
        while (it.hasNext()) {    // while teh iterator has next print the next value
            System.out.println(it.next());   // next method helps to move to the next value

        }
        StateNameList.remove("PA");
        Iterator it1 = StateNameList.listIterator();
        while (it1.hasNext()) {
            System.out.println("Print all the values  " + it1.next());
        }


        List<String> houseList = new ArrayList<>();
        houseList.add("House1");
        houseList.add("House2");
        houseList.add("House3");
        houseList.add("House3");
        houseList.add("House1");
        houseList.add("House1");
        houseList.add("House1");

        System.out.println(houseList.get(0));
        System.out.println(houseList.get(1));
        System.out.println(houseList.remove(3));
        System.out.println(houseList.size());


    }


}
