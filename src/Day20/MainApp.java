package Day20;

import Day20.BookSystem.BookService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        BookService library = new BookService();
        Scanner scanner = new Scanner(System.in);
        String choice=null;

        do {
            System.out.println("\nWelcome to Library Management System");
            System.out.println("1. Register Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Find Book By Name");
            System.out.println("4. Find Book By ID");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.registerBook();
                    break;
                case "2":
                    library.displayAllBooks();
                    break;
                case "3":
                    library.findBookByName();
                    break;
                case "4":
                    library.findBookById();
                    break;
                case "5":
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("5"));
    }
}
