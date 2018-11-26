package practice.tasks;

public class NamedLoop {

    public static void main(String[] args) {
        loop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 3)
                    break loop;
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
