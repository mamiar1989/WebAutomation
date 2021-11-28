package OOP.inheritance;

public class Daughter extends Father {

    public String daughterFavouriteDish = "shrimp";
    public String daughterFavouriteSport = "Badminton";
    public String daughterFavouriteSSN = "456328745666666";
    private String daughterAccountNumber;


    public Daughter() {
    }


    public Daughter(String daughterFavouriteDish) {
        this.daughterFavouriteDish = daughterFavouriteDish;

    }

    public Daughter(String daughterFavouriteDish, String daughterFavouriteSport, String daughterFavouriteSSN) {
        this.daughterFavouriteDish = daughterFavouriteDish;
        this.grandFatherFavouriteSport = daughterFavouriteSport;
        this.daughterFavouriteSSN = daughterFavouriteSSN;

    }


    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;

    }

    public static void dance() {
        System.out.println("daughter love to dance ");

    }

    public static void cooking() {
        System.out.println("daughter love to cook");

    }

    public static void singing() {
        System.out.println("daughter love to sing ");


    }

    public static void learning() {
        System.out.println("daughter love to learn new things");


    }


}
