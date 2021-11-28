
package OOP.inheritance;

public class Father extends GrandFather {

    public String FatherFavouriteDish = "Chicken";
    public String FatherFavouriteSport = "Tennis";
    public String FatherFavouriteSSN = "6666668585";
    private String FatherAccountNumber;


    public Father() {
    }

    public Father(String grandFatherFavouriteDish, String fatherFavouriteDish, String fatherFavouriteSport) {
        super(grandFatherFavouriteDish);
        FatherFavouriteDish = fatherFavouriteDish;
        FatherFavouriteSport = fatherFavouriteSport;
    }

    public Father(String grandFatherFavouriteDish, String fatherFavouriteDish) {
        super(grandFatherFavouriteDish);
        FatherFavouriteDish = fatherFavouriteDish;
    }

    public void swim() {
        System.out.println( "Father  can Swim");

    }

    public void beard() {
        System.out.println( "Father  have a beard");

    }

    public void hairColor() {
        System.out.println( "Father  hair color is brown ");

    }

    public void goodPersonality() {
        System.out.println( "Father  have a good personality ");

    }

    public void eyes() {
        System.out.println( "Father has bleu eyes ");


    }

    public void weight() {
        System.out.println( "Father  is in a good shape");

    }


}

















