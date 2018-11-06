package practice.practiceBook.util;

public class Bravo203 extends Alpha203 {

    private char symbol;

    private void show() {
        System.out.println("Класс Bravo:");
        System.out.println("Пое symbol - " + this.symbol);
        for (int i = 1; i <= 18; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public Bravo203(String name, int code, char symbol) {
        super(name, code);
        this.symbol = symbol;
        show();
    }

    public Bravo203(char symbol) {
        super();
        this.symbol = symbol;
        show();
    }

    public Bravo203(String name) {
        super(name);
        this.symbol = 'A';
        show();
    }

    public Bravo203(int code) {
        super(code);
        this.symbol = 'B';
        show();
    }

    public Bravo203() {
        this.symbol = 'C';
        show();
    }

    public Bravo203(String name, int code) {
        this(name, code, 'D');
    }
}
