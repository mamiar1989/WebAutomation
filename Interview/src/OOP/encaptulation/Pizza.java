package OOP.encaptulation;

public class Pizza {

    // Encapsulation: dataHiding , hide the data from public by making
    // to hide the data,
    // encapsulation in java is mechanism of wrapping the data (variables) so that it can nor be accessed from other classes
    // and code acting  on the data (methods) together as a as a single unit
    //encapsulation the variables of a class will be hidden from other classses and can be accessed only through the methods
    // of the current class


    private String pizzaName;
    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    public Pizza() {  // default constractor
    }

    public Pizza(String pizzaName) { //
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String toppingName) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
    }


    public Pizza(String pizzaName, String toppingName, int price, char size, String typeOfPizza, boolean isAvailable) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
        this.price = price;
        this.size = size;
        this.typeOfPizza = typeOfPizza;
        this.isAvailable = isAvailable;
    }
    // we have to use Getter and Setter method to get the properties of the private variables
    // getter method
    // Getter Method : Return type


    public String getToppingName() {
        return toppingName;

    }
    // setter method
    // setter  Method :  non Return type



    public boolean isAvailable () {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;

    }
    public int getPrice() {
        return price;}

        public void setPrice ( int price){
            this.price = price;


        }

        public char getSize () {
            return size;
        }

    public void setSize(char size) {
        this.size = size;
    }
        public String getTypeOfPizza () {
            return typeOfPizza;
        }



    }

