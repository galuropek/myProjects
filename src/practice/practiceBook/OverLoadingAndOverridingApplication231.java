package practice.practiceBook;

class Alpha231 {

    void show() {
        System.out.println("Класс Alpha");
    }

    void show(String txt) {
        System.out.println(txt);
    }
}

class Bravo231 extends Alpha231 {

    @Override
    void show() {
        System.out.println("Класс Bravo");
    }

    void show(int num) {
        System.out.println("Число " + num);
    }
}

public class OverLoadingAndOverridingApplication231 {

    public static void main(String[] args) {
        Alpha231 objA = new Alpha231();
        objA.show();
        objA.show("Object A");
        Bravo231 obj = new Bravo231();
        obj.show();
        obj.show("Object B");
        obj.show(123);
    }
}
