package practice.gerbageRecycler;

class Collector {

    static void takeGarbage(Employee employee) {
        if (employee instanceof Human) {
            if (Util.testForGrbage()) {
                System.out.println("All garbage is taken.");
            } else {
                System.out.println("This garbage is vary bad. It can`t be taken.");
            }
        } else if (employee instanceof Robot) {
            System.out.println("All garbage is taken.");
        } else if (employee instanceof Alien) {
            System.out.println("This garbage is vary bad. It can`t be taken.");
        }
    }
}
