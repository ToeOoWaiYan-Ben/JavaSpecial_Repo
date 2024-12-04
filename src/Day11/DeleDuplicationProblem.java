package Day11;

import java.util.Scanner;

public class DeleDuplicationProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String text = "I love u so so much";
        System.out.println("This is the original text:" + text);

        System.out.println("Enter what u want to delete the words:");
        String word = sc.nextLine();

        System.out.println("Are u sure to delete the words(yes/no):" + word);
        String confirm = sc.nextLine();
        if (confirm.equals("yes")) {
            String updateWord = DeleteSolve.deleteWords(text, word);
            System.out.println("Delete Successfully");
            System.out.println(updateWord);
        }else {
            System.out.println("Delete Failed");
        }

    }
}
