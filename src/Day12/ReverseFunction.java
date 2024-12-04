package Day12;

import java.util.Scanner;

public class ReverseFunction {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = "APPLE";
        System.out.println("This is the original sentence: " + text);

        System.out.println("Do you want to reverse the sentence? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            String reversedText = ReverseSolve.ReverseWords(text);
            System.out.println("Well done!!!!!!!!");
            System.out.println("This is the reversed sentence: " + reversedText);
        } else {
            System.out.println("Sorry, process failed :(");
        }
    }
}
