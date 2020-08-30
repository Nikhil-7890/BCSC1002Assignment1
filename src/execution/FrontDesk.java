/*  Created by IntelliJ IDEA.
 *  User: Nikhil Saxena (191500501)
 *  Date: 29/08/20
 *  Time: 8:25 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK_FIRST = 2;
    private static final int SHOW_ME_ALL_MY_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentChoice;
        Student student = new Student();
        Library library = new Library();
        library.setBooksInLibrary();
        String bookName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How can I help you today?");
            System.out.println("1. Issue a new book .");
            System.out.println("2. Return a previously issued book first.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice from (1..4): ");
            studentChoice = scanner.nextInt();
            switch (studentChoice) {
                case ISSUE_A_NEW_BOOK:
                    scanner.nextLine();
                    System.out.println("Please Enter your name: ");
                    student.setNameOfTheStudent(scanner.nextLine());
                    System.out.println("Please Enter your University Roll number: ");
                    student.setUniversityRollNumberOfTheStudent(scanner.nextLong());
                    System.out.println("How many books do you want to issue?: ");
                    student.setNumberOfBooksIssuedByTheStudent(scanner.nextInt());
                    System.out.println("These are the available books: ");
                    library.showAvailableBooks();
                    scanner.nextLine();
                    System.out.println("Please Enter the details of the book you want to be  issued: ");
                    for
                    (int bookIssuingIndex = 0; bookIssuingIndex < student.getNumberOfBooksIssuedByTheStudent(); bookIssuingIndex++) {
                        System.out.println("Please Enter name of the book " + (bookIssuingIndex + 1) + ": ");
                        bookName = scanner.nextLine();
                        student.issueBooksToStudents(bookIssuingIndex, bookName);
                    }
                    System.out.println("Thank you for Issuing the new Book..");
                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK_FIRST:
                    if (student.getNumberOfBooksIssuedByTheStudent() == 0) {
                        System.out.println("Sorry, no book has been issued from your account yet so the book cannot be returned.");
                    } else {
                        System.out.println("Enter the name of the book you want to return: ");
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        if (student.returnBook(bookName)) {
                            System.out.println("Thank you for returning the book " + bookName + ".");
                        }

                    }
                    break;
                case SHOW_ME_ALL_MY_ISSUED_BOOKS:
                    student.showIssuedBooksByStudent();
                    break;
                case EXIT:
                    System.out.println("Thank you for using our service.");
                    break;
                default:
                    System.out.println("Your have not entered the correct choice !");
                    break;
            }
        } while (studentChoice != EXIT);
        scanner.close();
    }
}