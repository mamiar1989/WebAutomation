package datastructureandalgoritheme.map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // Map is interface working as    < Key, value>
    // map returns the number of key value in the mapping
    //Map IS useful if you have to search any data


    String name = "James";

    public static void main(String[] args) {

// we created a map array we set the value with the method put.
        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("Nepal", "KTN");
        stateMap.put("france", "Paris");
        stateMap.put("Spain", "barcelona");
        stateMap.put("Italy", "Roma");
        stateMap.put("USA", "CA");
        stateMap.put("Canada", "Quebec");
        stateMap.put("algeria", "algiers");
        stateMap.put("GB", "london");
        System.out.println(stateMap.get("Nepal")); // we call the first one because its the key
        System.out.println(stateMap.get("france"));

        // How to retrieve all the values
        // for each loop
        for (Map.Entry<String, String>
                entry : stateMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("ALGERIA", "16 ");
        countryMap.put("TOUNISIA", " 36");
        countryMap.put("Morocco", "66 ");
        countryMap.put("South africa ", "89 ");
        countryMap.put("Spain", " 023");
        countryMap.put("FRANCE", "365 ");
        System.out.println(countryMap.get("Algeria"));

        for (Map.Entry<String, String> entry : stateMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());



       for(Map.Entry<String,String>  entry1: countryMap.entrySet()  ){
           System.out.println(entry1.getKey()+ entry1.getValue());
       }

// Another approach
            for(String st: stateMap.keySet()){
                System.out.println(st+ " : " + stateMap.get(st));
            }

        }

    }

}
