/*  Created by IntelliJ IDEA.
 *  User: Nikhil Saxena (191500501)
 *  Date: 28/08/20
 *  Time: 7:16PM
 *  File Name : Book.java
 */
package definitions;

public class Book {


    private String nameOfBooks;
    private String nameOfAuthors;
    private String isbnNumberOfBooks;

    public Book() {
        this.nameOfBooks = "JAVA a Beginner's Guide";
        this.nameOfAuthors = "Herbert Schildt";
        this.isbnNumberOfBooks = "9858147654445";
    }

    public Book(String nameOfBooks,
                String nameOfAuthors,
                String isbnNumberOfBooks) {
        this.nameOfBooks = nameOfBooks;
        this.nameOfAuthors = nameOfAuthors;
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }

    public String getNameOfBooks() {
        return nameOfBooks;
    }

    public String getNameOfAuthors() {
        return nameOfAuthors;
    }

    public String getIsbnNumberOfBooks() {
        return isbnNumberOfBooks;
    }