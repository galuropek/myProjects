package practice.practiceBook;

interface First {

    void hello();
}

interface Second {

    void hi();
}

class MyClass253 implements First, Second {

    @Override
    public void hello() {
        System.out.println("First interface`s method");
    }

    @Override
    public void hi() {
        System.out.println("Second interface`s method");
    }
}

public class UsingInterfacesApplication253 {
    public static void main(String[] args) {

        MyClass253 obj = new MyClass253();
        obj.hello();
        obj.hi();
    }
}
