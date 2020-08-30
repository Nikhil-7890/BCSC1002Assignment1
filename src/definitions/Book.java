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

    public void setNameOfBooks(String nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    public void setNameOfAuthors(String nameOfAuthors) {
        this.nameOfAuthors = nameOfAuthors;
    }

    public void setIsbnNumberOfBooks(String isbnNumberOfBooks) {
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }

    public String toString() {
        return "Name Of Book:" + " " + this.nameOfBooks + "\n"
                + "Name Of Author Of Book:" + " " + getNameOfAuthors() + "\n"
                + "ISBN Code Of The Book:" + " " + this.isbnNumberOfBooks + ".";
    }

    public void doCheckout() {
        System.out.println("Thank you for issuing the Book.");
    }

    public void doReturn() {
        System.out.println("Thank you for returning the Book .");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBooks(), book.getNameOfBooks()) &&
                Objects.equals(getNameOfAuthors(), book.getNameOfAuthors()) &&
                Objects.equals(getIsbnNumberOfBooks(), book.getIsbnNumberOfBooks());
    }
