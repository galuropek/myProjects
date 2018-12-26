package practice.itmathrepetitor.classes;

public class Task1 {

    public static void main(String[] args) {
        Student[] students = initStudent();
    }

    private static Student[] initStudent() {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
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
