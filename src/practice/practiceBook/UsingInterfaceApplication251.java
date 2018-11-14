package practice.practiceBook;

interface MyInterface251 {

    int NUMBER = 100;

    int getNumber(double x);

    char getSymbol(int n);
}

class MyClass251 implements MyInterface251 {

    @Override
    public int getNumber(double x) {
        return (int) x;
    }

    @Override
    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}

public class UsingInterfaceApplication251 {
    public static void main(String[] args) {
        MyClass251 obj = new MyClass251();
        System.out.println("Статическая константа: " + MyClass251.NUMBER);
        System.out.println("Целое число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(5));
    }
}