package practice.gerbageRecycler;

public class Human extends Employee{

    public Human(String who) {
        super(who);
    }

    @Override
    public void collectGarbage() {
        System.out.println(super.getWho() + " collected garbage.");
    }

    @Override
    public void giveGarbage() {
        System.out.println(super.getWho() + " gives away garbage.");
    }
}
