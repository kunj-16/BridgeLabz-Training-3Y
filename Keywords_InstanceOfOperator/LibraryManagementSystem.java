class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title : " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN  : " + this.isbn);
        } else {
            System.out.println("Invalid object - not a Book instance.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Programming", "Herbert Schildt", "ISBN101");
        Book b2 = new Book("Python Basics", "Guido van Rossum", "ISBN102");
        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}
