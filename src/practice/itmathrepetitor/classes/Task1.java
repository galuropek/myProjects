package practice.itmathrepetitor.classes;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        Student[] students = initStudent();
        Student[] sortedStudents = sortStudents(students);
    }

    private static Student[] sortStudents(Student[] students) {
        Student[] sortedStudents = Arrays.copyOf(students, students.length);
        for (int i = 0; i < sortedStudents.length; i++) {
            Student student = sortedStudents[i];
            int[] marks = student.getMarks();
            double avg = 0.0;
            for (int j = 0; j < marks.length; j++) {
                avg = avg + marks[j];
            }
            student.setAvg(avg / marks.length);
        }
        return students;
    }

    private static Student[] initStudent() {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            Student student = new Student(
                    "Name" + i,
                    "Surname" + i,
                    i,
                    randomMarks());
            students[i] = student;
        }
        return students;
    }

    private static int[] randomMarks() {
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = (int) (Math.random() * 5) + 1;
        }
        return marks;
    }
}
