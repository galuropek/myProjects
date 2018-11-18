package project2;

abstract class Message implements Reaction{

    @Override
    public void reaction() {
        System.out.println("Это класс super");
    }
}
