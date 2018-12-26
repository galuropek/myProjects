package practice.itmathrepetitor.classes;

import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private int numberOfGroup;
    private int[] marks = new int[5];

    public Student(String name, String surname, int numberOfGroup, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.numberOfGroup = numberOfGroup;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfGroup=" + numberOfGroup +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
