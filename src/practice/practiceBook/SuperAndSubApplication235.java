package practice.practiceBook;

class Alpha235 {

    String name;

    void show() {
        StringBuilder txt = new StringBuilder("Object Alpha\n");
        txt.append("Field name: ").append(name).append("\n");
        for (int i = 0; i < 20; i++) {
            txt.append("-");
        }
        System.out.println(txt);
    }
}

class Bravo235 extends Alpha235{

    int code;

    @Override
    void show() {
        StringBuilder txt= new StringBuilder("Object Bravo\n");
        txt.append("Field name:").append(name).append("\n");
        txt.append("Field code:").append(code).append("\n");
        for (int i = 0; i < 20; i++) {
            txt.append("-");
        }
        System.out.println(txt);
    }
}

public class SuperAndSubApplication235 {

    public static void main(String[] args) {
        Alpha235 objA = new Alpha235();
        objA.name = "Alpha";
        objA.show();
        Bravo235 objB = new Bravo235();
        objB.name = "Bravo";
        objB.code = 235;
        objB.show();
        objA = objB;
        objA.name = "Charlie";
        objA.show();
        objB.show();
    }
}
