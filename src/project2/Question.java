package project2;

public class Question extends Message{

    private String value;

    public String getValue() {
        return value;
    }

    Question(String value) {
        super("question");
        this.value = value;
    }

    @Override
    public void reaction() {
        System.out.println("Это вопрос");
    }
}
