package practice.practiceBook;

interface Base {

    void show();
}

class Alpha254 implements Base {

    private String word;

    Alpha254(String txt) {
        word = txt;
    }

    @Override
    public void show() {
        System.out.println("Object Alpha");
        System.out.println("Text field: " + word);
    }
}

class Bravo254 implements Base {

    private int number;

    Bravo254(int number) {
        this.number = number;
    }

    @Override
    public void show() {
        System.out.println("Object Bravo");
        System.out.println("Integer field: " + number);
    }
}

public class UsingInterfaceVarsApplication254 {

    public static void main(String[] args) {

        Base ref;
        ref = new Alpha254("text");
        ref.show();
        ref = new Bravo254(123);
        ref.show();
    }
}
