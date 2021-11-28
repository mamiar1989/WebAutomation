package datastructureandalgoritheme.Array;

public class Learn2DArray {

    // 2 d Array


    // data type [1d][2d] arrayName= new datatype [sizeOne ][sizeTow]
    // data type [1d][2d] arrayName= new datatype [number of row ][number of column]

    public static void main(String[] args) {
        String[][] carInfo = {
                {"Car", "carModel", "carColor", "carPrice", "carYear"},
                {"Tesla", "t27", "red", "110000", "2023"},
                {"BMW", "c56", "green", "58000", "2019"},
                {"Audie", "q7", "black", "80000", "2017"},
                {" INFINITY", "MD56", "white", "110000", "2022"}

        };

        System.out.println("the car information are as follow " + carInfo[2][2]);
        String[][] studentName = new String[6][4];

        System.out.println(studentName.length);

        studentName[0][0] = "sl";
        studentName[0][1] = "FistName";
        studentName[0][2] = "LatName";
        studentName[0][3] = "Address";

        studentName[1][0] = "101";
        studentName[1][1] = "james";
        studentName[1][2] = "zIPI";
        studentName[1][3] = "NY";

        studentName[2][0] = "103";
        studentName[2][1] = "AMEL";
        studentName[2][2] = "AMIAR";
        studentName[2][3] = "FR";

        studentName[3][0] = "104";
        studentName[3][1] = "NANCY";
        studentName[3][2] = "FANCY";
        studentName[3][3] = "CH";

        studentName[4][0] = "105";
        studentName[4][1] = "ALLI";
        studentName[4][2] = "NADIM";
        studentName[4][3] = "NJ";

        studentName[5][0] = "106";
        studentName[5][1] = "EASHA";
        studentName[5][2] = "HASS";
        studentName[5][3] = "OH";

//        studentName[6][0] = "107";
//        studentName[6][1] = "NAMMM";
//        studentName[6][2] = "OLBY";
//        studentName[6][3] = "NJ";
//
        System.out.println("studentName is " + studentName[4][3]);


        try {
            System.out.println("studentName is " + studentName[6][1]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("this is an array exception");

        } finally {
            System.out.println("this is the finally block ");
        }

//**************************For Each Loop**********************************************************************************

        // to retrieve all the data we use for each loop and we convert the 2 d to 1 d

        for (String std[] : studentName) {
            for (String st : std) {
                System.out.println(st + "    ");
            }
        }
        System.out.println();
    }
}

