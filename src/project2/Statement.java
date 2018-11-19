package project2;

public class Statement extends Message{

    Statement(String value) {
        super("statement", value);

    }

    @Override
    public void reaction() {
        System.out.println("Это утверждение");
    }
}
