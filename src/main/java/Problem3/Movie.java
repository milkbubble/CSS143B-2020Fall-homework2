package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.title = title;
        this.rating = rating;
        this.id = UUID.randomUUID();
    }

    public Movie(Movie anotherMovie) {
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie o = (Movie) obj;
        return o.id == this.id;
    }

}
