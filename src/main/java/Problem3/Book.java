package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework\
        this.id = anotherBook.id;
        this.title = anotherBook.title;
        this.author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Book anotherBook = (Book) obj;
        boolean equivalent = (this.id == anotherBook.id) && (this.title == anotherBook.title) &&
                (this.author == anotherBook.author);
        return equivalent;
    }
}
