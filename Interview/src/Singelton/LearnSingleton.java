package Singelton;

public class LearnSingleton {
    // we are allowed to create on instance of a class at time
    // using private constructor we can insure that more than one object can be created at a time


    private LearnSingleton() {
    }


    //Create an instance variable / object

    public static LearnSingleton instance=new LearnSingleton();

    // we create a private constructor to
//// set private properties so that no one can have access ypour code

    public static void main(String[] args) {
        LearnSingleton ls = new LearnSingleton();
    }


}

