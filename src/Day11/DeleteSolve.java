package Day11;

public class DeleteSolve {
    public static String deleteWords(String text, String deleteDuplicateWords) {
        String[] words = deleteDuplicateWords.split(" ");
        for (String word : words) {
            text = text.replaceAll(" " + word + " ", " ");
        }
        return text;
    }
}
