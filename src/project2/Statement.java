package project2;

public class Statement extends Message{

    private String value;

    public String getValue() {
        return value;
    }

    public Statement(String value) {
        this.value = value;
    }

    @Override
    public void reaction() {
        System.out.println("Это утверждение");
    }
}
