package practice.gerbageRecycler;

class Collector {

    static String takeGarbage(Employee employee) {
        if (employee instanceof Human) {
            if (Util.testForGrbage()) {
                return "All garbage is taken";
            } else {
                return "This garbage is vary bad. It can`t be taken";
            }
        } else if (employee instanceof Robot) {
            return "All garbage is taken";
        } else if (employee instanceof Alien) {
            return "This garbage is vary bad. It can`t be taken";
        } else
            return "Unknown employee";
    }
}
