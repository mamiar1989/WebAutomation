package controlflow;

public class LearnNestedIfElseIf {
    // Nested if else : child if else


    public static void main(String[] args) {
        int score = 96;
        if (score >= 90&& score <=95) {
            System.out.println("you got an A");
        }
        if (score >= 92) {
            System.out.println("you are excellent");
        } else
            if (score == 95) {
                System.out.println("you are a genius");


        } else if (score >= 80) {
            System.out.println("you got A-");

        } else if (score >= 70) {
            System.out.println("you got A");
        } else if (score >= 60) {
            System.out.println("you got B");
        } else if (score >= 50) {
            System.out.println("you got C");
        } else {
            System.out.println("you got F");
        }
    }


}
