package datastructureandalgoritheme.Array;

public class learn3DArray {

    // Declare a 3 D Array\

    static String[][][] pizza = new String[2][6][5];
    static String[][][] pizza1 = new String[2][6][5];


    public static void main(String[] args) {

        //assign values

        learn3DArray.pizza[0][0][0] = "st";
        learn3DArray.pizza[0][0][1] = "nameof pizza";
        learn3DArray.pizza[0][0][2] = "sizw";
        learn3DArray.pizza[0][0][3] = "qty";
        learn3DArray.pizza[0][0][4] = "price";


        learn3DArray.pizza[0][1][0] = "101";
        learn3DArray.pizza[0][1][1] = "meat pizza";
        learn3DArray.pizza[0][1][2] = "12";
        learn3DArray.pizza[0][1][3] = "2";
        learn3DArray.pizza[0][1][4] = "28";


        learn3DArray.pizza[0][3][0] = "102";
        learn3DArray.pizza[0][3][1] = "vegetarian";
        learn3DArray.pizza[0][3][2] = "18";
        learn3DArray.pizza[0][3][3] = "3";
        learn3DArray.pizza[0][3][4] = "200";


        learn3DArray.pizza[0][4][0] = "103";
        learn3DArray.pizza[0][4][1] = "margarita";
        learn3DArray.pizza[0][4][2] = "23";
        learn3DArray.pizza[0][4][3] = "5";
        learn3DArray.pizza[0][4][4] = "120";

        //************************************************** for each loop ******************************************

        // convert from a  2D to a 1D

        for ( String pizz [][]: pizza){
            // convert from a  3D to a 2D
            for(String piz[]: pizz){
                for(String pi:piz ){
                    System.out.println("Pizza info is : "+ pi +"            ");
                }
                System.out.println();  // this comes on rose because we used the sout at the end
            }


        }







    }

}
