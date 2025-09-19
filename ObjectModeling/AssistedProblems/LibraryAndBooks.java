import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Pride and Prejudice", "Jane Austen");
        Book b2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book b3 = new Book("Moby Dick", "Herman Melville");
        Book b4 = new Book("Jane Eyre", "Charlotte Brontë");
        Book b5 = new Book("Wuthering Heights", "Emily Brontë");

        Library l1 = new Library("City Library");
        Library l2 = new Library("University Library");

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        l2.addBook(b2);
        l2.addBook(b4);
        l2.addBook(b5);

        l1.showBooks();
        l2.showBooks();
    }
}
