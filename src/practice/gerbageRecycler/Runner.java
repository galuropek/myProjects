package practice.gerbageRecycler;

import static practice.gerbageRecycler.Collector.takeGarbage;

public class Runner {

    public static void main(String[] args) {

        //=====test methods==========
//        Employee human = new Human();
//        Employee robot = new Robot();
//        Employee alien = new Alien();
//        System.out.println(human.getWho());
//        human.collectGarbage();
//        human.giveGarbage();
//        System.out.println(robot.getWho());
//        robot.collectGarbage();
//        robot.giveGarbage();
//        System.out.println(alien.getWho());
//        alien.collectGarbage();
//        alien.giveGarbage();
        //===========================
        System.out.println("===================Empl=======================");
        for (int i = 0; i < 5; i++) {
            Employee employee = Util.createEmployee();
            System.out.println(employee.getWho());
            employee.collectGarbage();
            employee.giveGarbage();
            String response = Collector.takeGarbage(employee);
            Util.print(response);
            System.out.println("===================next=======================");
        }
    }
}
