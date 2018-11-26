package practice.tasks;

public class ToInfinity {

    //SuppressWarnings - for example
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
            System.out.println("infinity");
        }
    }
}
