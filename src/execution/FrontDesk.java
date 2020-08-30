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
    private static final int Issue_a_new_Book = 1;
    private static final int Return_a_Previously_Issued_Book_First = 2;
    private static final int Show_me_all_my_Issued_Books = 3;
    private static final int Exit = 4;
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
                case Issue_a_New_Book:
                    scanner.nextLine();
                    System.out.println("Please Enter your name: ");
                    student.setNameOfTheStudent(scanner.nextLine());
                    System.out.println("Please Enter your University Roll number: ");
                    student.setUniversityRollNumberOfTheStudent(scanner.nextLong());
                    System.out.println("How many books you want to issue?: ");
                    student.setNumberOfBooksIssuedByTheStudent(scanner.nextInt());
                    System.out.println("These are the available books: ");
            }

        }