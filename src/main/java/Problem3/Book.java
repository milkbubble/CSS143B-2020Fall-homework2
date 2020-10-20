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
        this.title = anotherBook.title;
        this.id = anotherBook.id;
        this.author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) {
            return false;
        }

        Book o = (Book) obj;
        return o.id == this.id ;
    }

}
