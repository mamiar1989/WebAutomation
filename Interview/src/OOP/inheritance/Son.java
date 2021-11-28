package OOP.inheritance;

public class Son extends Father {

    // son is inheriting father and grand father properties
    // MultiLevel inheritance


    public String SonFatherFavouriteDish = "Turkey";
    public String SonFatherFavouriteSport = "cricket";
    public String SonFatherFavouriteSSN = "45635656565";
    private String SonFatherAccountNumber;

    public Son() {
    }


    public Son(String grandFatherFavouriteDish, String fatherFavouriteDish, String sonFatherFavouriteDish) {
        super(grandFatherFavouriteDish, fatherFavouriteDish);
        SonFatherFavouriteDish = sonFatherFavouriteDish;
    }


    public String getSonFatherAccountNumber() {
        return SonFatherAccountNumber;
    }

    public void setSonFatherAccountNumber(String sonFatherAccountNumber) {
        SonFatherAccountNumber = sonFatherAccountNumber;
    }

    public void Student() {
        System.out.println("Son is  QA engineer");

    }

    ;

    public void player() {
        System.out.println("Son is  a good player ");
    }


    public void hiking() {
        System.out.println("Son loves hiking ");
    }


    public void gym() {
        System.out.println("Son go to the gym regularly");
    }


    public void videoGame() {
        System.out.println("Son can play video games ");
    }


    public void bodyBuilder() {
        System.out.println("Son is  body BUilder ");
    }


}
