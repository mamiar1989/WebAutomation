package OOP.encaptulation;

public class TestPizza {


    // when i want to use the private variable from another class i have to use getter and setter
    // getter method and setter method

    // getter method return type
    // private String topping name


    // when you create getter and setter 1 rst we create getter then setter method
    //when you use getter and setter , first we set value then we get value.
    // use setter then getter

    public static void main(String[] args) {
        Pizza pz = new Pizza();  // OBJECT

        pz.setToppingName("mashroom");
        System.out.println(pz.getToppingName());


        pz.setAvailable(true);
        System.out.println(pz.isAvailable());


    }


}
