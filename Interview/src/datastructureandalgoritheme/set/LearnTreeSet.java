package datastructureandalgoritheme.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {


    // Both Set and Tree set are not allowing duplicate values
    // Tree set where the elements are sorted , in ascending order  alphabetically


    // Set is an interface which extends collection. it is an un order collection of objects in which
    // duplicate values can not be stored

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet

    // A Set is a set of values which is not allowed duplicate elements. its a parent interface of all set classes like TreeSet, HashSet.
    // A HashSet is set where elements are not sorted or ordered. it is faster than a TreeSet.

    public static void main(String[] args) {
        TreeSet<String> iphoneModel = new TreeSet<>();
        iphoneModel.add("12");
        iphoneModel.add("11");
        iphoneModel.add("10");
        iphoneModel.add("7");
        iphoneModel.add("6");
        iphoneModel.add("x");
        iphoneModel.add("18");
        iphoneModel.add("18");// not allowing duplicate values, will return only one time
        System.out.println(iphoneModel);
        System.out.println(iphoneModel.remove("11"));  // removed and return a boolean value /// true
        System.out.println(iphoneModel);
        iphoneModel.pollFirst();  // remove 1rst value
        System.out.println(iphoneModel);
        iphoneModel.pollLast();
        System.out.println(iphoneModel);
        System.out.println(iphoneModel.contains("12 pro"));
        System.out.println(iphoneModel.contains("x"));
        System.out.println(iphoneModel.contains("12"));


        TreeSet<String> mobileBrand = new TreeSet<>();
        mobileBrand.add("Samsung");
        mobileBrand.add("LG");
        mobileBrand.add("Condor");
        mobileBrand.add("Iphone");
        mobileBrand.add("Nokia");
        mobileBrand.add("Blackberry");

        mobileBrand.add("Google");
        System.out.println(mobileBrand);  // comes in alphabetical order


    }
}
