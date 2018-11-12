package practice.practiceBook.util;

public class Bravo224 extends Alpha224 {

    private int code;

    public Bravo224(String name, int code) {
        super(name);
        this.code = code;
    }

    public void show() {
        super.show();
        System.out.println("Числовое поле " + code);
    }


}
