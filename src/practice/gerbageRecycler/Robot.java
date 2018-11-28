package practice.gerbageRecycler;

public class Robot extends Employee{

    public Robot(String who) {
        super(who);
    }

    @Override
    public void collectGarbage() {
        System.out.println("Robot collected garbage.");
    }

    @Override
    public void giveGarbage() {
        System.out.println("Robot gives away garbage.");
    }
}
