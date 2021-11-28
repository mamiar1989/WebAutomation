package datastructureandalgoritheme.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is an interface which extends collection, it is an order collection of objects in which
    // duplicate can not be stored ******can not add duplicate values
    // Set is implemented by Hashset or LinkedHashSet, UseTreeSet

    public static void main(String[] args) {

        Set<String> mobileBrand = new HashSet<>();
        mobileBrand.add("Samsung");
        mobileBrand.add("LG");
        mobileBrand.add("Condor");
        mobileBrand.add("Iphone");
        mobileBrand.add("Nokia");
        mobileBrand.add("Blackberry");
        mobileBrand.add("Google");

        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("Nokia")); // returns boolean value
        System.out.println("After Remove" + mobileBrand);
        System.out.println(mobileBrand.contains("Samsung"));

    }


}
