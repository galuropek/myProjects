package practice.gerbageRecycler;

public class Robot extends Employee{

    Robot() {
        super("Robot");
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
