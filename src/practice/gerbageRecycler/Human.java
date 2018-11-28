package practice.gerbageRecycler;

public class Human extends Employee{

    public Human(String who) {
        super(who);
    }

    @Override
    public void collectGarbage() {
        System.out.println("Human collected garbage.");
    }

    @Override
    public void giveGarbage() {
        System.out.println("Human gives away garbage.");
    }
}
