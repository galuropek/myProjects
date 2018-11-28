package practice.gerbageRecycler;

public class Alien extends Employee {

    public Alien(String who) {
        super(who);
    }

    @Override
    public void collectGarbage() {
        System.out.println("Alien collected garbage.");
    }

    @Override
    public void giveGarbage() {
        System.out.println("Alien gives away garbage.");
    }
}
