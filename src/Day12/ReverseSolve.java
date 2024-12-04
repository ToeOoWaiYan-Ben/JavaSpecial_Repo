package Day12;

public class ReverseSolve {
    public static String ReverseWords(String text) {
        String[] words = text.split("");
        int left = 0, right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        return String.join("", words);
    }
}
