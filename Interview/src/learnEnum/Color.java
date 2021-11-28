package learnEnum;

public enum Color {
    Red, Blue, Green, yellow;

    String name = "james"; //in enum we can declare a variable
    int age;

    public void tvDisplay() {
        System.out.println("this is Tv Display");    // enum we can declare a method
    }

    Color(){}  // we can declare a constructor
  Color(String name){
        this.name=name;
  }  // we can declare  a  parameterized constructor


}
