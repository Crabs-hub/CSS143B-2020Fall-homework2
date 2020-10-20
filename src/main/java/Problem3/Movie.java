package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Movie anotherMovie = (Movie) obj;
        boolean equivalence = (this.id == anotherMovie.id) && (this.rating == anotherMovie.rating) &&
                (this.title == anotherMovie.title);
        return equivalence;
    }
}
