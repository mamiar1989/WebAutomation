package constructor;

public class Burger {

	String nameOfBurger;
	char size;
	String topping;
	double priceOfBurger;
	int quantityOfBurger;
	double totalValue;
	boolean isBurgerAvailable;

	public Burger() {

	}

	public Burger(String nameOfBurger) {
		this.nameOfBurger = nameOfBurger;
		System.out.println("Burger name is " + this.nameOfBurger);
		// System.out.println("Burger name is "+nameOfBurger);
	}


	public Burger(String nameOfBurger, char size) {
		String burgerName = this.nameOfBurger = nameOfBurger;
		char burgerSize = this.size = size;
		System.out.println("Burger name is " + burgerName + " Burger size " + burgerSize);
	}
	

	public Burger(String nameOfBurger, String topping, char size) {
		String burgerName = this.nameOfBurger = nameOfBurger;
		char burgerSize = this.size = size;
		String burgerTopping = this.topping=topping;
		System.out.println("Burger name is " + burgerName + " Burger size " + burgerSize+" Topping is "+burgerTopping);
	}
	
	public Burger(String nameOfBurger, String topping, char size, double priceOfBurger,int quantityOfBurger, double totalValue, boolean isBurgerAvailable ) {
		String burgerName = this.nameOfBurger = nameOfBurger;
		char burgerSize = this.size = size;
		String burgerTopping = this.topping=topping;
		double burgerPrice = this.priceOfBurger=priceOfBurger;
		int burgerQuantity= this.quantityOfBurger=quantityOfBurger;
		double burgerTotalValue= this.totalValue=totalValue;
		boolean burgerAvailabilityCheck=this.isBurgerAvailable=isBurgerAvailable;
		
		System.out.println("Burger name is " + burgerName + " Burger size " + burgerSize+" Topping is "
		+burgerTopping+" Burger Price "+burgerPrice+" Quantity "+burgerQuantity+" Total value "
				+burgerTotalValue+" Burger Availability "+burgerAvailabilityCheck);
	}

	public static void main(String[] args) {

		Burger myBurger = new Burger();

		Burger yourBurger = new Burger("Dominos");
		System.out.println(yourBurger.nameOfBurger);

		Burger herBurger = new Burger("FiveGuys");
		System.out.println(herBurger.nameOfBurger);
		
		Burger khusbu = new Burger("Wendys", "tomato", 'S', 10.99, 61, 670.39, true);
		

	}

}
