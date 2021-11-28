package random;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Locale;

public class LearnStringST {





    public static void main(LearnStringST[] args) {

        String Song= "I want to see alive";
        System.out.println(Song.charAt(6));
        System.out.println(Song.toUpperCase());
        System.out.println(Song.toLowerCase());
        System.out.println(Song.contains("s"));
        System.out.println(Song.substring(5));
        System.out.println(Song.substring(10));
        System.out.println(Song.getBytes());
        System.out.println(Song.equalsIgnoreCase("I WANT to SEE aLive"));
        System.out.println(Song.length());
        System.out.println(Song.equals("couscous"));
        System.out.println(Song.equals("i want to see alive "));





    }




}
