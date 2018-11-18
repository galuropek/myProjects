package project2;

abstract class Message implements Reaction {

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
