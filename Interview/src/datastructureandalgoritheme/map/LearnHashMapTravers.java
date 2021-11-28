package datastructureandalgoritheme.map;

import datastructureandalgoritheme.linklist.LearnLinkList;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {
    // keyPoints
    // For operations like add , remove, containsKey, time complexity is 0
    // Tree map always keeps the elements in a sorted (increasing) order, while the elements in HashMap has no Order
    public static void main(String[] args) {

        int [] numbers = {56,7,56,556,603,12,45,78,56,89,42,32,56,98,465,7,33};
        LearnHashMapTravers.printFrequency(numbers);
    }

        public static void printFrequency(int[] num) {
            HashMap<Integer, Integer> hmap = new HashMap<>();

            for (int i = 0; i < num.length; i++) {
                Integer count = hmap.get(num[i]);

                if (hmap.get(num[i]) == null) {
                    hmap.put(num[i], 1);
                } else {
                    hmap.put(num[i], ++count);
                }
            }
            for (Map.Entry mp : hmap.entrySet()) {
                System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
            }
        }
    }





