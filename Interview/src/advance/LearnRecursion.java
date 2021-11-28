package advance;

public class LearnRecursion {

    // its a a prossess in which a method calls itself continuously
    // must call itself
    // must have a base case
    //must change its state and  move towards the base case

    static int count =0;
    public static void tvDisplay(){   // the condition is true so it printed one time
// we put in th increment , and the condition count is less than 10
      count ++;
        if(count <10){
            System.out.println("this is tv Display Method");
      tvDisplay();  // this is recursion A method is calling itself

        }
    }

    public static void main(String[] args) {
        LearnRecursion.tvDisplay();
    }


}
