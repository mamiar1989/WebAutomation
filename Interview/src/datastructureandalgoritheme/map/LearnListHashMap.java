package datastructureandalgoritheme.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {


    public static void main(String[] args) {

        List<String> stateNameOfUSA = new LinkedList<String>();

        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("PA");
        stateNameOfUSA.add("OH");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("VA");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("LA");
        stateNameOfUSA.add("CO");
        stateNameOfUSA.add("ID");
        stateNameOfUSA.add("IL");
        stateNameOfUSA.add("DV");
        stateNameOfUSA.add("WI");
        stateNameOfUSA.add("WD");


        List<String> stateNameOfCanada = new LinkedList<String>();

        stateNameOfCanada.add("toronto");
        stateNameOfCanada.add("quebec");
        stateNameOfCanada.add("ottawa");
        stateNameOfCanada.add("montreal");
        stateNameOfCanada.add("Victoria ");
        stateNameOfCanada.add("Vancouver");
        stateNameOfCanada.add("ontario");


        List<String> stateNameOfFrance = new LinkedList<String>();

        stateNameOfFrance.add("Paris");
        stateNameOfFrance.add("Marseille");
        stateNameOfFrance.add("AIX ");
        stateNameOfFrance.add("Reuon");
        stateNameOfFrance.add("lile");
        stateNameOfFrance.add("nice");
        stateNameOfFrance.add("cane");



        // i will put my lists inside the map , i nees the value
        Map<String,List<String> >stMap= new HashMap<>();
        stMap.put("USA",stateNameOfUSA);
        stMap.put("CANADA",stateNameOfCanada);
        stMap.put("FRANCE",stateNameOfFrance);


        for(Map.Entry<String,List <String>> entry: stMap.entrySet())
        {
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }









    }

}
