package practice.tasks;

//распечатать слово задом на перед

public class Task3 {
    public static void main(String[] args) {
        String word = "привет";
        System.out.println(reverseWord(word));
    }

    private static String reverseWord(String word) {
        StringBuilder result = new StringBuilder();
        char[] array = word.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }
}
