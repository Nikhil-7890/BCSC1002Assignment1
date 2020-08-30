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

    }