package project2;

abstract class Message implements Reaction {

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    Message(String name, String value) {
        this.name = name;
        this.value = value;
    }

    static Message createMessage(String message) {
        message = message.trim();
        if (Util.isItQuestion(message)) {
            return new Question(message);
        } else
            return new Statement(message);
    }

    @Override
    public void reaction() {
        System.out.println("Это класс super");
    }
}