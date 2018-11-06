package practice.practiceBook.util;

class Alpha203 {

    private String name;
    private int code;

    Alpha203(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - " + this.name);
        System.out.println("Поле code - " + this.code);
    }

    Alpha203(String name) {
        this(name, 0);
    }

    Alpha203(int code) {
        this("Белый", code);
    }

    Alpha203() {
        this("Желтый", 1);
    }
}
