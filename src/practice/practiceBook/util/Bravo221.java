package practice.practiceBook.util;

public class Bravo221 extends Alpha221 {

    private int code;

    public Bravo221(String name, int code) {
        super(name);
        this.code = code;
    }

    @Override
    public void show() {
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - " + name);
        System.out.println("Поле code - " + code);
    }
}
