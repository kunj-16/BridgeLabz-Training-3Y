class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public void displayAuthorInfo() {
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        if (author != null) {
            author.displayAuthorInfo();
        } else {
            System.out.println("Author: Not available");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "British author known for the Harry Potter fantasy series.");
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 1997, author1);

        System.out.println("--- Book and Author Details ---");
        book1.displayInfo();
    }
}