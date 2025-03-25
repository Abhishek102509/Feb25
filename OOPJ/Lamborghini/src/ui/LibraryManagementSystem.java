package ui;

import models.Book;
import models.Library;
import models.Member;
import services.LibraryService;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryService libraryService = new LibraryService(library);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Borrowed Books");
            System.out.println("7. Display Statistics");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    System.out.println("Book added: " + title + " by " + author + " (ISBN: " + ISBN + ")");
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addMember(new Member(name, memberID));
                    System.out.println("Member added: " + name + " (ID: " + memberID + ")");
                    break;

                case 3:
                    System.out.println("Available Books:");
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    int borrowMemberID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter ISBN: ");
                    String borrowISBN = scanner.nextLine();
                    try {
                        libraryService.borrowBook(borrowMemberID, borrowISBN);
                        System.out.println("Book borrowed successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Enter member ID: ");
                    int returnMemberID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter ISBN: ");
                    String returnISBN = scanner.nextLine();
                    try {
                        libraryService.returnBook(returnMemberID, returnISBN);
                        System.out.println("Book returned successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.print("Enter member ID: ");
                    int displayMemberID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Member member = library.findMember(displayMemberID);
                    if (member != null) {
                        System.out.println("Borrowed Books:");
                        member.printBorrowedBooks();
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 7:
                    libraryService.printStatistics();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}