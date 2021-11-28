package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    // to read the data we need the path location
    //  C:\Users\maria\IdeaProjects\Interview\DataTest
    // Absolute Path:
    // means full path , data test directory , right click on it
    //Relative Path:
    // this path can be used on any operating system .

    public static void main(String[] args) throws IOException {

        LearnDataReader.readData();
    }

    public static void readData() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filePath = "C:\\Users\\maria\\IdeaProjects\\Interview\\DataTest\\Sample.txt";  //i used the absolute path
        //  ../interview\DataTest\Sample.txt  ***** this is the relative path start by the project, dont forget to set the ../ in the beginning


        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception exception) {
                System.out.println("File Already  closed ");
            }
        }
    }


}



