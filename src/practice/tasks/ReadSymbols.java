package practice.tasks;

public class ReadSymbols {

    //java-help.ru task 1
    private static void counterSpaces(String text) {
        int counterSpace = 0;
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ')
                counterSpace++;
            else if (aChar == '.')
                break;
        }
        System.out.println("Counter spaces: " + counterSpace);
    }

    public static void main(String[] args) {
        String text = "Ngannou would register four straight " +
                "first-round stoppage wins over the next 20 " +
                "months to earn a shot at the heavyweight title, " +
                "while Blaydes climbed the ranks behind him, " +
                "registering a four-fight unbeaten streak of " +
                "his own heading into 2018, but that is where " +
                "their paths diverged.";
        counterSpaces(text);
    }
}
