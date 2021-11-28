package OOP.inheritance;

public class GrandFather {
    // variable
    public String grandFatherFavouriteDish = "Fish";
    public String grandFatherFavouriteSport = "Soccer";
    public String grandFatherFavouriteSSN = "45632874566";
    private String grandFatherAccountNumber;


    public GrandFather() {

    }

    public GrandFather(String grandFatherFavouriteDish) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
    }


    public GrandFather(String grandFatherFavouriteDish, String grandFatherFavouriteSport, String grandFatherFavouriteSSN) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
        this.grandFatherFavouriteSport = grandFatherFavouriteSport;
        this.grandFatherFavouriteSSN = grandFatherFavouriteSSN;
    }


    public String getGrandFatherFavouriteSSN() {
        return grandFatherFavouriteSSN;
    }

    public void setGrandFatherFavouriteSSN(String grandFatherFavouriteSSN) {
        this.grandFatherFavouriteSSN = grandFatherFavouriteSSN;
    }

    public void fishing() {
        System.out.println("Grand Father love to go to fishing");

    }

    public void height() {
        System.out.println("Grand Father love to go to fishing");

    }

    public void jump() {
        System.out.println("Grand Father love to jump");

    }

    public void playGame() {
        System.out.println("Grand Father love to play game");


    }

    public void bloodGroup() {
        System.out.println("Grand Father blood group ia B+");

    }

    public void tellStories() {
        System.out.println("Grand Father love to tell stories");

    }

    public void loveAnimals() {
        System.out.println("Grand Father love animals");

    }


}
