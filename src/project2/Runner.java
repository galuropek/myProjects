package project2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String inputLine;
        while (!(inputLine = scanner.nextLine()).equalsIgnoreCase("пока")) {
            Message.createMessage(inputLine).reaction();
        }
    }
}
