package project2;

public class Question extends Message{

    Question(String value) {
        super("question", value);
    }

    @Override
    public void reaction() {
        String avsver = Util.parseMessage(this);
        System.out.println(avsver);
    }
}
