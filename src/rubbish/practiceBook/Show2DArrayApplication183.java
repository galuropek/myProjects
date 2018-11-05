package rubbish.practiceBook;

public class Show2DArrayApplication183 {

    private static void show(int[][] nums) {
        for (int[] num : nums) {
            for (int aNum : num) {
                System.out.print(aNum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] alpha = {{1, 2, 3,}, {4, 5, 6,}};
        int[][] bravo = {{1, 2, 3,}, {4, 5,}, {6, 7, 8, 9}};
        System.out.println("Массив alpha:");
        show(alpha);
        System.out.println("Массив bravo:");
        show(bravo);
    }
}
