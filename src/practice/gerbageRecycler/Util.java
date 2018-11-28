package practice.gerbageRecycler;

public class Util {

    static boolean testForGrbage() {
        boolean result = false;
        int random = (int) (Math.random() * 2);
        if (random == 1)
            result = true;
        return result;
    }

    static Employee createEmployee() {
        int employeeClass = generateEmployeeClass();
        if (employeeClass == 1) {
            return new Human();
        } else if (employeeClass == 2) {
            return new Robot();
        } else if (employeeClass == 3) {
            return new Alien();
        }
        return null;
    }

    private static int generateEmployeeClass() {
        return (int) (Math.random() * 3 + 1);
    }
}
