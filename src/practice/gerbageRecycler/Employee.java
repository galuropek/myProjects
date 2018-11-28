package practice.gerbageRecycler;

public abstract class Employee implements GarbageInterface {

    private String who;

    String getWho() {
        return who;
    }

    Employee(String who) {
        this.who = who;
    }

    @Override
    public void collectGarbage() {
        System.out.println("collect: Abstract class Employee");
    }

    @Override
    public void giveGarbage() {
        System.out.println("give: Abstract class Employee");
    }
}
