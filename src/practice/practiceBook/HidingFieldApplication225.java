package practice.practiceBook;

class Alpha {

    String name;
}

class Bravo extends Alpha {

    private String name;

    void show() {
        System.out.println("Из класса Alpha: " + super.name);
        System.out.println("Из класса Bravo: " + name);
    }

    Bravo(String nameA, String nameB) {
        super();
        super.name = nameA;
        name = nameB;
    }
}

public class HidingFieldApplication225 {

    public static void main(String[] args) {
        Bravo obj = new Bravo("alpha", "bravo");
        obj.show();
    }
}
