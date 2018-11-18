package project2;

public class Ansver extends Message {

    private String value;

    public String getValue() {
        return value;
    }

    public Ansver(String value) {
        super("Ansver");
        this.value = value;
    }

    @Override
    public void reaction() {
        super.reaction();
    }
}
