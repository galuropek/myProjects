package practice.gerbageRecycler;

public class Util {

    static boolean testForGrbage() {
        boolean result = false;
        int random = (int) (Math.random());
        if (random == 1)
            result = true;
        return result;
    }
}
