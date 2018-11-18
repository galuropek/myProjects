package project2;

public class Statement extends Message{

    private String value;

    public String getValue() {
        return value;
    }

    Statement(String value) {
        this.value = value;
        reaction();
    }

    @Override
    public void reaction() {
        System.out.println("Это утверждение");
    }
}
