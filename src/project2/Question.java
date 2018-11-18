package project2;

public class Question extends Message{

    private String value;

    public String getValue() {
        return value;
    }

    public Question(String value) {
        this.value = value;
    }

    @Override
    public void reaction() {
        System.out.println("Это был вопрос");
    }
}
