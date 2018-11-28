package practice.gerbageRecycler;

public class Runner {

    public static void main(String[] args) {

        //=====test methods==========
        Employee human = new Human();
        Employee robot = new Robot();
        Employee alien = new Alien();
        System.out.println(human.getWho());
        human.collectGarbage();
        human.giveGarbage();
        System.out.println(robot.getWho());
        robot.collectGarbage();
        robot.giveGarbage();
        System.out.println(alien.getWho());
        alien.collectGarbage();
        alien.giveGarbage();
        //===========================
    }
}
