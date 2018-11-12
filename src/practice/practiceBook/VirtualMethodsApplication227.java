package practice.practiceBook;

class Alpha227 {

    String name ;

    void objectCreated(){
        System.out.println("Создан объект класса Alpha");
    }

    void hello(){
        System.out.println("Объект класса Alpha");
    }

    void show(){
        hello();
        System.out.println("Поле name: " + name);
    }

    Alpha227(String txt) {
        objectCreated();
        name = txt;
    }
}

class Bravo227 extends Alpha227{

    Bravo227(String txt) {
        super(txt);
    }

    @Override
    void objectCreated() {
        System.out.println("Создан объект класса Bravo");
    }

    @Override
    void hello(){
        System.out.println("Объект класса Bravo");
    }
}

public class VirtualMethodsApplication227 {

    public static void main(String[] args) {
        Alpha227 objA = new Alpha227("alpha");
        objA.show();
        Bravo227 objB = new Bravo227("bravo");
        objB.show();
    }
}
