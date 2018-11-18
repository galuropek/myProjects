package project2;

abstract class Message implements Reaction {

    private String name;

    public String getName() {
        return name;
    }

    Message(String name) {
        this.name = name;
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