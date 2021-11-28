package OOP.inheritance;

public class Test {
// we you extend father with grand father class means that the father is going
    // to inherit grand father properties
// the father can not access the private properties of the grand father unless they us
    // getter and setter
    // father is class and suoer class is grand father
// one class extend another is called single level inheritance
    // to extend classes you have to extend one by one , one a t a time

    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.fishing();
        gf.height();
        gf.getGrandFatherFavouriteSSN();


        Father ft = new Father();

        ft.jump();
        ft.fishing();
        ft.beard();
        ft.loveAnimals();


        Son sn = new Son();

        sn.hairColor();
        sn.fishing();
        sn.playGame();
        sn.hairColor();
        sn.player();
        sn.Student();





        Daughter dg= new Daughter();
        dg.jump();
        dg.playGame();
        dg.dance();
        dg.jump();
        dg.eyes();




    }

}
