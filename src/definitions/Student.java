/*  Created by IntelliJ IDEA.
 *  User:  Nikhil Saxena (191500501)
 *  Date: 30/08/20
 *  Time: 6:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String name;
    private long universityRollNUmber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String name, long universityRollNUmber, int numberOfBooksIssued) {
        this.name = name;
        this.universityRollNUmber = universityRollNUmber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = new Book[1];
        nameOfBooksIssued[0] = new Book();
    }

    public Student() {
        this.nameOfBooksIssued = new Book[1];
        nameOfBooksIssued[0] = new Book();
    }

    public String getName() {
        return name;
    }

    public long getUniversityRollNUmber() {
        return universityRollNUmber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public Book[] getBooksIssued() {
        return nameOfBooksIssued.clone();
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setUniversityRollNUmber(long universityRollNUmber) {
        this.universityRollNUmber = universityRollNUmber;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.nameOfBooksIssued = booksIssued;
    }

    public String toString() {
        return "Student Name: " + getName() + "University Roll Number: " + getUniversityRollNUmber() + "Number of books issued by student: " + getUniversityRollNUmber() + "Names of book issued: " + Arrays.toString(getBooksIssued());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNUmber() == student.getUniversityRollNUmber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getName(), student.getName()) &&
                Arrays.equals(getBooksIssued(), student.getBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getUniversityRollNUmber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getBooksIssued());
        return result;
    }

    /**
     * This method will allow the student to issue the book.
     *
     * @param bookName
     */
    public void doIssueBook(String bookName) {
        System.out.println(bookName + "issued successfully");
    }

    /**
     * this method will allow the student to return the book.
     *
     * @param bookName
     */
    public void doReturnBook(String bookName) {
        System.out.println(bookName + "returned successfully");
    }
