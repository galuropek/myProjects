package practice.gerbageRecycler;

public abstract class Employee implements gerbageInterface {

    private String who;

    public Employee(String who) {
        this.who = who;
    }

    @Override
    public void collectGerbage() {
        System.out.println("collect: Abstract class Employee");
    }

    @Override
    public void giveGerbage() {
        System.out.println("give: Abstract class Employee");
    }
}
