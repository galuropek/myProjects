package practice.practiceBook;

class MyClass {

    private String name;
    private int code;

    MyClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder("Объект класса MyClass\n");
        txt.append("Поле name: ").append(name).append("\n");
        txt.append("Поле code: ").append(code).append("\n");
        for (int i = 0; i < 21; i++) {
            txt.append("-");
        }
        return txt.toString();
    }
}

public class UsingToStringApplication233 {

    public static void main(String[] args) {
        MyClass obj = new MyClass("Object", 123);
        System.out.println(obj);
    }
}
