package practice.gerbageRecycler;

public class Human extends Employee{

    Human() {
        super("Human");
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
