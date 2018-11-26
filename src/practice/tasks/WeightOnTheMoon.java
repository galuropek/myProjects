package practice.tasks;

import java.util.Scanner;

public class WeightOnTheMoon {

    //java-help.ru - task 2
    private static double calcWeightOnTheMoon(double weight) {
        return weight * 17 / 100;
    }

    public static void main(String[] args) {
        System.out.println("Enter your weight:");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("Your weight on the moon:\n" + calcWeightOnTheMoon(weight));
    }
}
