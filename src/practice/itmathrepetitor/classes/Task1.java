package practice.itmathrepetitor.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        Student[] students = initStudent();
        List<Student> sortedStudents = sortStudents(students);
//        printStudentsList();
    }

    private static List<Student> sortStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            int[] marks = student.getMarks();
            double avg = 0.0;
            for (int j = 0; j < marks.length; j++) {
                avg = avg + marks[j];
            }
            student.setAvg(avg / marks.length);
        }
        List<Student> sortedStudents = Arrays.asList(students);
        Collections.sort(sortedStudents);
        return sortedStudents;
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
